package com.jeep.shoponlineapi.model;

import javax.persistence.*;

@Entity
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String code;

    private Double discountPercentage;

    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;

    @OneToOne(mappedBy = "coupon")
    private Bill bill;

    public Coupon() {
    }

    public Coupon(String code, Double discountPercentage, Boolean isDeleted, Bill bill) {
        this.code = code;
        this.discountPercentage = discountPercentage;
        this.isDeleted = isDeleted;
        this.bill = bill;
    }

    public Coupon(Integer id, String code, Double discountPercentage, Boolean isDeleted, Bill bill) {
        this.id = id;
        this.code = code;
        this.discountPercentage = discountPercentage;
        this.isDeleted = isDeleted;
        this.bill = bill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
