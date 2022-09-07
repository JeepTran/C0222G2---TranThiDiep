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

    @OneToMany(mappedBy = "cart")
    private List<Product> productList;
    @ManyToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "id")
    private Bill bill;

    public Cart() {
    }
    public Cart(Integer quantity, Boolean isDeleted, List<Product> productList, Customer customer, Bill bill) {
        this.quantity = quantity;
        this.isDeleted = isDeleted;
        this.productList = productList;
        this.customer = customer;
        this.bill = bill;
    }
    public Cart(Integer id, Integer quantity, Boolean isDeleted, List<Product> productList,
                Customer customer, Bill bill) {
        this.id = id;
        this.quantity = quantity;
        this.isDeleted = isDeleted;
        this.productList = productList;
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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
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
