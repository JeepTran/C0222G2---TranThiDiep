import {Component, OnInit} from '@angular/core';
import {Product} from "../../model/product";
import {ProductService} from "../../service/product.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  product: Product;
  productFormEdit: FormGroup;

  constructor(private productService: ProductService,
              private activatedRoute: ActivatedRoute, private router: Router) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap)=>{
      const id = parseInt(paramMap.get('id'));
      this.product = this.productService.getProductById(id);
      this.productFormEdit = new FormGroup({
        id: new FormControl(this.product.id),
        name: new FormControl(this.product.name),
        price: new FormControl(this.product.price),
        description: new FormControl(this.product.description)
      });
    });

  }

  submitEdit(){
    const product = this.productFormEdit.value;
    console.log(product);
    this.productService.editProduct(product.id, product);
    this.router.navigateByUrl("/product/list").then();
  }
}
