import {Component, OnInit} from '@angular/core';
import {Product} from "../../model/product";
import {ProductService} from "../../service/product.service";
import {ActivatedRoute, ParamMap} from "@angular/router";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  product: Product = {};
  productFormEdit: FormGroup;

  constructor(private productService: ProductService,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap)=>{
      const id = parseInt(paramMap.get('id'));
      this.product = this.productService.getProductById(id)[0];
      this.productFormEdit = new FormGroup({
        id: new FormControl(`${this.product.id}`),
        name: new FormControl(`${this.product.name}`),
        price: new FormControl(`${this.product.price}`),
        description: new FormControl(`${this.product.description}`)
      });
    });
  }

  ngOnInit(): void {
  }

  submitEdit(id:number){
    if(this.productFormEdit.valid){
    this.product = this.productFormEdit.value;
    this.productService.editProduct(id, this.product);
  }
  }
}
