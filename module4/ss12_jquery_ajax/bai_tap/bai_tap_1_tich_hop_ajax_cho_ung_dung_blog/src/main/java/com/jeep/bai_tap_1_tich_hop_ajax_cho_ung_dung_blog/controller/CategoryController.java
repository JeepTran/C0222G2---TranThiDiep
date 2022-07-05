package com.jeep.bai_tap_tich_hop_restful_blog.controller;

import com.jeep.bai_tap_tich_hop_restful_blog.model.Blog;
import com.jeep.bai_tap_tich_hop_restful_blog.model.Category;
import com.jeep.bai_tap_tich_hop_restful_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public ResponseEntity<Page<Category>> listCategory(@PageableDefault(value = 3) Pageable pageable) {
        Page<Category> categoryList = this.categoryService.findAllCategory(pageable);
        if (!categoryList.hasContent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> createCategory(@RequestBody Category category) {
        categoryService.save(category);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
