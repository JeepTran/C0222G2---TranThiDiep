package com.jeep.shoponlineapi.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer quantity;
    private Boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "bill_id", referencedColumnName = "id")
    private Bill bill;

    public Cart() {
    }

    public Cart(Integer quantity, Boolean isDeleted, Product product, Customer customer, Bill bill) {
        this.quantity = quantity;
        this.isDeleted = isDeleted;
        this.product = product;
        this.customer = customer;
        this.bill = bill;
    }

    public Cart(Integer id, Integer quantity, Boolean isDeleted, Product product, Customer customer, Bill bill) {
        this.id = id;
        this.quantity = quantity;
        this.isDeleted = isDeleted;
        this.product = product;
        this.customer = customer;
        this.bill = bill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
