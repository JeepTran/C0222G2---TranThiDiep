package com.jeep.exam_backend.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
public class ProductBlock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String blockId;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private int quantity;
    private String importDate;
    private String manufactureDate;
    private String expireDate;

    public ProductBlock() {
    }

    public ProductBlock(String blockId, Product product, int quantity,
                        String importDate, String manufactureDate, String expireDate) {
        this.blockId = blockId;
        this.product = product;
        this.quantity = quantity;
        this.importDate = importDate;
        this.manufactureDate = manufactureDate;
        this.expireDate = expireDate;
    }

    public ProductBlock(int id, String blockId, Product product, int quantity,
                        String importDate, String manufactureDate, String expireDate) {
        this.id = id;
        this.blockId = blockId;
        this.product = product;
        this.quantity = quantity;
        this.importDate = importDate;
        this.manufactureDate = manufactureDate;
        this.expireDate = expireDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImportDate() {
        return importDate;
    }

    public void setImportDate(String importDate) {
        this.importDate = importDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
}
