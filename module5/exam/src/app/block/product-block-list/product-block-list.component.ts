import {Component, OnInit} from '@angular/core';
import {ProductBlock} from '../../model/product-block';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductBlockService} from '../../service/product-block.service';
import {ToastrService} from 'ngx-toastr';
import {Router} from '@angular/router';

@Component({
  selector: 'app-product-block-list',
  templateUrl: './product-block-list.component.html',
  styleUrls: ['./product-block-list.component.css']
})
export class ProductBlockListComponent implements OnInit {
  productBlocks: ProductBlock[] = [];
  searchForm: FormGroup;
  page = 1;
  blockId: number;
  productName: string;
  importDate: string;
  productBlock: ProductBlock;

  constructor(private productBlockService: ProductBlockService,
              private toastr: ToastrService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.getProductBlocks();
  }

  getProductBlocks() {
    this.productBlockService.getAllProductBlocks().subscribe(
      data => {
        this.productBlocks = data;
        this.getSearchForm();
      }, error => {
        console.log(error);
      }
    );
  }

  getSearchForm() {
    this.searchForm = new FormGroup({
      searchProductName: new FormControl(''),
      searchExpireDate: new FormControl('')
    });
  }

  search() {
    const productName = this.searchForm.value.searchProductName;
    const expireDate = this.searchForm.value.searchExpireDate;
    this.productBlockService.searchProductBlockByNameAndExpireDate(
      productName, expireDate).subscribe(
      data => {
        this.productBlocks = data;
      },
      error => {
        console.log(error);
      }
    );
  }

  sendId(blockId: number, productName: string, importDate: string) {
    this.blockId = blockId;
    this.productName = productName;
    this.importDate = importDate;
  }

  deleteProductBlock() {
    this.productBlockService.deleteProductBlock(this.blockId).subscribe(
      data => {
        this.showToastr();
        this.ngOnInit();
      }, error => {
        console.log(error);
      }
    );
  }

  showToastr() {
    this.toastr.success('Successful!', 'Delete Block "' + this.productName + '"', {
      progressBar: true,
      timeOut: 1500
    });
  }
}
