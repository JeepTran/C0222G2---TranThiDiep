import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {CategoryService} from "../../service/category.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";

@Component({
  selector: 'app-category-edit',
  templateUrl: './category-edit.component.html',
  styleUrls: ['./category-edit.component.css']
})
export class CategoryEditComponent implements OnInit {

  categoryForm: FormGroup;
  id:number;

  constructor(private categoryService:CategoryService,
              private activatedRoute:ActivatedRoute,
              private router:Router) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap:ParamMap)=>{
      this.id = +paramMap.get('id');
      const category = this.getCategory(this.id);
      this.categoryForm = new FormGroup({
        id: new FormControl(category.id),
        name:new FormControl(category.name)
      });
    });
  }

  getCategory(id:number){
    return this.categoryService.findById(id);
  }
  updateCategory(id:number){
    const category = this.categoryForm.value;
    this.categoryService.updateCategory(id,category);
    this.router.navigate(['/category/list']);
  }
}
