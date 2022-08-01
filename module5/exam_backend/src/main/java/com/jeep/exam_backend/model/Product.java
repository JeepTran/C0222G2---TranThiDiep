package com.jeep.exam_backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String origin;
    private int price;
    private String unit;
    @JsonBackReference
    @OneToMany(mappedBy = "product")
    private List<ProductBlock> productBlockList;

    public Product() {
    }

    public Product(String name, String origin, int price, String unit,
                   List<ProductBlock> productBlockList) {
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.unit = unit;
        this.productBlockList = productBlockList;
    }

    public Product(int id, String name, String origin, int price,
                   String unit, List<ProductBlock> productBlockList) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.unit = unit;
        this.productBlockList = productBlockList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<ProductBlock> getProductBlockList() {
        return productBlockList;
    }

    public void setProductBlockList(List<ProductBlock> productBlockList) {
        this.productBlockList = productBlockList;
    }
}
