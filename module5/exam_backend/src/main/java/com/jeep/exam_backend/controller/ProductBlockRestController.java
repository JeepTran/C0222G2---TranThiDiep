package com.jeep.exam_backend.controller;

import com.jeep.exam_backend.model.Product;
import com.jeep.exam_backend.model.ProductBlock;
import com.jeep.exam_backend.service.IProductBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("productBlockApi")
@CrossOrigin
//        (origins = "http://localhost:4200")
public class ProductBlockRestController {

    @Autowired
    private IProductBlockService productBlockService;


    @GetMapping("/productBlockList")
    public ResponseEntity<List<ProductBlock>> getProductBlockList() {
        List<ProductBlock> productBlockList = this.productBlockService.getAllProductBlock();
        return new ResponseEntity<>(productBlockList, HttpStatus.OK);
    }


    @GetMapping("/productList")
    public ResponseEntity<List<Product>> getProductList() {
        List<Product> productList = this.productBlockService.getAllProduct();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @PostMapping("/createProductBlock")
    public ResponseEntity<Void> createProductBlock(@RequestBody ProductBlock productBlock){
        this.productBlockService.createProductBlock(productBlock);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
