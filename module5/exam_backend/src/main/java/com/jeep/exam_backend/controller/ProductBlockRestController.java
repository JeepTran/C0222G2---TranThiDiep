package com.jeep.exam_backend.controller;

import com.jeep.exam_backend.model.Product;
import com.jeep.exam_backend.model.ProductBlock;
import com.jeep.exam_backend.service.IProductBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("store")
@CrossOrigin(origins = "http://localhost:4200")
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

    @PostMapping("/productBlockList")
    public ResponseEntity<Void> createProductBlock(@RequestBody ProductBlock productBlock) {
        this.productBlockService.createProductBlock(productBlock);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/productBlockList/{id}")
    public ResponseEntity<ProductBlock> getProductBlockById(@PathVariable int id) {
        Optional<ProductBlock> productBlock = this.productBlockService.getProductBlockById(id);
        if (productBlock.isPresent()) {
            return new ResponseEntity<>(productBlock.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/productBlockList/{id}")
    public ResponseEntity<Void> deleteProductBlockById(@PathVariable int id) {
        Optional<ProductBlock> productBlock = this.productBlockService.getProductBlockById(id);
        if (productBlock.isPresent()) {
            this.productBlockService.deleteProductBlockById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping("/productBlockList/{id}")
    public ResponseEntity<ProductBlock> editProductBlockById(@PathVariable int id, @RequestBody ProductBlock productBlock) {
        Optional<ProductBlock> productBlockOptional = this.productBlockService.getProductBlockById(id);
        System.out.println(productBlockOptional.get());
        if (productBlockOptional.isPresent()) {
            System.out.println(this.productBlockService.editProductBlock(productBlock));
            return new ResponseEntity<>(this.productBlockService.editProductBlock(productBlock), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
