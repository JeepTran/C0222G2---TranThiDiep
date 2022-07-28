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
  product: Product;
  productFormEdit: FormGroup;
  id: number;

  constructor(private productService: ProductService,
              private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.getProduct(this.id);
    });
  }

  getProduct(id: number) {
    return this.productService.getProductById(id).subscribe(
      product => {
        this.productFormEdit = new FormGroup({
          name: new FormControl(product.name),
          price: new FormControl(product.price),
          description: new FormControl(product.description)
        });
      }
    );
  }

  submitEdit() {
    const product = this.productFormEdit.value;
    this.productService.editProduct(product.id, product).subscribe(()=>{
      console.log("Edit successfully!");
    },e=>{
      console.log("Fail to edit!")
    });
  }
}
