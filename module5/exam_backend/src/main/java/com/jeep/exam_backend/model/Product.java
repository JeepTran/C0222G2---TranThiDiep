package com.jeep.exam_backend.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String name;
    private String origin;
    private int price;
    private String unit;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductBlock> productBlockList;

    public Product() {
    }

    public Product(String name, String origin, int price, String unit) {
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.unit = unit;
    }

    public Product(int productId, String name, String origin,
                   int price, String unit) {
        this.productId = productId;
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.unit = unit;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int id) {
        this.productId = id;
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
}
