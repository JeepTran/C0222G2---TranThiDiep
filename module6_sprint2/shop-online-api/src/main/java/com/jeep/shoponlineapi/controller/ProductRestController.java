package com.jeep.shoponlineapi.controller;

import com.jeep.shoponlineapi.model.Product;
import com.jeep.shoponlineapi.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop/product")
public class ProductRestController {
    @Autowired
    private IProductService productService;

    @GetMapping("/list")
    public ResponseEntity<Page<Product>> getProductList(@PageableDefault(10) Pageable pageable) {
        Page<Product> products = this.productService.getAllProduct(pageable);
        if (products.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
