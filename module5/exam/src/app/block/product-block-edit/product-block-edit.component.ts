import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';
import {ProductBlock} from '../../model/product-block';
import {ProductBlockService} from '../../service/product-block.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {Product} from '../../model/product';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-product-block-edit',
  templateUrl: './product-block-edit.component.html',
  styleUrls: ['./product-block-edit.component.css']
})
export class ProductBlockEditComponent implements OnInit {
  blockForm: FormGroup;
  productBlock: ProductBlock;
  productBlocks: ProductBlock[] = [];
  products: Product[] = [];
  id: number;

  constructor(private productBlockService: ProductBlockService,
              private router: Router,
              private activatedRoute: ActivatedRoute,
              private toastr: ToastrService) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.ngOnInit();
    }, error => {
      console.log(error);
    });

  }

  ngOnInit(): void {
    this.getProductBlockWithId(this.id);
    this.getAllProduct();
    this.getAllProductBlock();
  }

  getAllProductBlock() {
    this.productBlockService.getAllProductBlocks().subscribe(
      data => {
        this.productBlocks = data;
      }, error => {
        console.log(error);
      }
    );
  }

  getAllProduct() {
    this.productBlockService.getAllProducts().subscribe(
      data => {
        this.products = data;
      },
      error => {
        console.log(error);
      }
    );
  }

  getProductBlockWithId(id: number) {
    this.productBlockService.getProductBlockById(id).subscribe(data => {
      this.productBlock = data;
      this.getBlockForm();
    }, error => {
      console.log(error);
    });
  }

  getBlockForm() {
    this.blockForm = new FormGroup({
      id: new FormControl(this.productBlock.id),
      blockId: new FormControl(this.productBlock.blockId,
        [Validators.required, Validators.pattern(/^LH\-[0-9]{4}$/)]),
      product: new FormControl(this.productBlock.product, [Validators.required]),
      quantity: new FormControl(this.productBlock.quantity, [Validators.required,
        Validators.pattern(/^[0-9]+$/), Validators.min(1)]),
      date: new FormGroup({
        importDate: new FormControl(this.productBlock.importDate, [Validators.required]),
        manufactureDate: new FormControl(this.productBlock.manufactureDate, [Validators.required]),
        expireDate: new FormControl(this.productBlock.expireDate, [Validators.required])
      }, this.dateValidate)
    });
  }

  private dateValidate(date: AbstractControl) {
    const importDate = new Date(date.value.importDate);
    const mfgDate = new Date(date.value.manufactureDate);
    const expDate = new Date(date.value.expireDate);
    if ((mfgDate.getTime() > importDate.getTime())
      || (importDate.getTime() > expDate.getTime())) {
      return {'errorDate': true};
    }
  }

  submit() {
    if (this.blockForm.valid) {
      const productBlock = this.blockForm.value;
      productBlock.importDate = this.blockForm.controls.date.value.importDate;
      productBlock.manufactureDate = this.blockForm.controls.date.value.manufactureDate;
      productBlock.expireDate = this.blockForm.controls.date.value.expireDate;
      this.productBlockService.editProductBlockById(this.id, productBlock).subscribe(() => {
        this.showToastr(this.blockForm.value.blockId);
        this.router.navigateByUrl('/block');
      }, error => {
        console.log(error);
      });
    }
  }

  compareProduct(p1: Product, p2: Product): boolean {
    return p1.id === p2.id;
  }

  showToastr(blockId: string) {
    this.toastr.success('Successful!', 'Update Block "' + blockId + '"', {
      progressBar: true,
      timeOut: 2000
    });
  }
}
