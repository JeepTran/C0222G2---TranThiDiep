package com.jeep.shoponlineapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String phone;

    private String address;

    private String email;

    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;

    @OneToMany(mappedBy = "customer")
    @JsonBackReference
    private List<Cart> cartList;

    @OneToOne
    @JoinColumn(name = "user_id")
    private AppUser appUser;

    public Customer() {
    }

    public Customer(String name, String phone, String address, String email,
                    Boolean isDeleted, List<Cart> cartList) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.isDeleted = isDeleted;
        this.cartList = cartList;
    }

    public Customer(Integer id, String name, String phone, String address,
                    String email, Boolean isDeleted, List<Cart> cartList) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.isDeleted = isDeleted;
        this.cartList = cartList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }
}
