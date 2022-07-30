package com.jeep.exam_backend.controller;

import com.jeep.exam_backend.model.Product;
import com.jeep.exam_backend.model.ProductBlock;
import com.jeep.exam_backend.service.IProductBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("productBlockApi")
public class ProductBlockRestController {

    @Autowired
    private IProductBlockService productBlockService;

    @GetMapping("/productBlockList")
    public List<ProductBlock> getProductBlockList() {
        List<ProductBlock> productBlockList = this.productBlockService.getAllProductBlock();
        return productBlockList;
    }
    @GetMapping("/productList")
    public List<Product> getProductList(){
        List<Product> productList = this.productBlockService.getAllProduct();
        return productList;
    }
}
