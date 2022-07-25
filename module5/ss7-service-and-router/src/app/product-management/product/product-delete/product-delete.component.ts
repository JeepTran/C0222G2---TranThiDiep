import {Component, OnInit} from '@angular/core';
import {Product} from "../../model/product";
import {ProductService} from "../../service/product.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {
  product: Product = {};
  productFormDelete: FormGroup;

  constructor(private productService: ProductService,
              private activatedRoute: ActivatedRoute,
              private router:Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap)=>{
      const id = parseInt(paramMap.get('id'));
       this.product = this.getProductById(id)[0];
      this.productFormDelete = new FormGroup({
        id: new FormControl(this.product.id),
        name: new FormControl(this.product.name),
        price: new FormControl(this.product.price),
        description: new FormControl(this.product.description)
      });
    });
  }

  ngOnInit(): void {
  }
  getProductById(id:number){
    return this.productService.getProductById(id);
  }

  deleteProductById(id:number){
    this.productService.deleteProduct(id);
    this.router.navigate(['/product/list']);
  }
}
