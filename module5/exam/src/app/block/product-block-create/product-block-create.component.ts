import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';
import {ProductBlockService} from '../../service/product-block.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-product-block-create',
  templateUrl: './product-block-create.component.html',
  styleUrls: ['./product-block-create.component.css']
})
export class ProductBlockCreateComponent implements OnInit {
  products: Product[] = [];
  blockForm: FormGroup = new FormGroup({
    id: new FormControl(''),
    blockId: new FormControl('',
      [Validators.required, Validators.pattern(/^LH\-[0-9]{4}$/)]),
    product: new FormControl('', [Validators.required]),
    quantity: new FormControl('', [Validators.required, Validators.pattern(/^[0-9]+$/), Validators.min(1)]),
    date: new FormGroup({
      importDate: new FormControl('', [Validators.required]),
      manufactureDate: new FormControl('', [Validators.required]),
      expireDate: new FormControl('', [Validators.required])
    }, this.dateValidate)
  });

  constructor(private productBlockService: ProductBlockService, private router: Router) {
  }

  ngOnInit(): void {
    this.productBlockService.getAllProducts().subscribe(
      data => {
        this.products = data;
      }, error => {
        console.log(error);
      }
    );
  }

  submit() {
    if (this.blockForm.valid) {
      const productBlock = this.blockForm.value;
      productBlock.quantity = +productBlock.quantity;
      productBlock.importDate = productBlock.date.importDate;
      productBlock.manufactureDate = productBlock.date.manufactureDate;
      productBlock.expireDate = productBlock.date.expireDate;
      this.productBlockService.createProductBlock(productBlock).subscribe(
        () => {
          this.blockForm.reset();
        }, error => {
          console.log(error);
        }, () => {
          this.router.navigateByUrl('/block');
        }
      );
    }
  }


  private dateValidate(date: AbstractControl) {
    const importDate = new Date(date.value.importDate);
    const mfgDate = new Date(date.value.manufactureDate);
    const expDate = new Date(date.value.expireDate);
    if ((mfgDate.getTime() > importDate.getTime())
      || (importDate.getTime() > expDate.getTime())) {
      console.log(importDate.getTime());
      console.log(importDate.getTime() - mfgDate.getTime());
      return {'errorDate': true};
    }
  }
}
