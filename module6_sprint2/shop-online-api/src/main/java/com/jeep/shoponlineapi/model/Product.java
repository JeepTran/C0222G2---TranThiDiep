package com.jeep.shoponlineapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "text")
    private String image;

    private String name;

    private Double originPrice;

    private String color;

    private String capacity;

    private String originCountry;

    private Date publishDate;

    private Double discountPercentage;

    @Column(columnDefinition = "longtext")
    private String description;

    @Column(columnDefinition = "longtext")
    private String techSpecification;

    @Column(columnDefinition = "text")
    private String productSet;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;

    @OneToMany(mappedBy = "product")
    @JsonBackReference
    private List<Cart> cartList;

    public Product() {
    }

    public Product(String image, String name, Double originPrice, String color, String capacity, String originCountry,
                   Date publishDate, Double discountPercentage, String description, String techSpecification,
                   String productSet, Category category, Boolean isDeleted, List<Cart> cartList) {
        this.image = image;
        this.name = name;
        this.originPrice = originPrice;
        this.color = color;
        this.capacity = capacity;
        this.originCountry = originCountry;
        this.publishDate = publishDate;
        this.discountPercentage = discountPercentage;
        this.description = description;
        this.techSpecification = techSpecification;
        this.productSet = productSet;
        this.category = category;
        this.isDeleted = isDeleted;
        this.cartList = cartList;
    }

    public Product(Integer id, String image, String name, Double originPrice, String color, String capacity,
                   String originCountry, Date publishDate, Double discountPercentage, String description,
                   String techSpecification, String productSet, Category category, Boolean isDeleted, List<Cart> cartList) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.originPrice = originPrice;
        this.color = color;
        this.capacity = capacity;
        this.originCountry = originCountry;
        this.publishDate = publishDate;
        this.discountPercentage = discountPercentage;
        this.description = description;
        this.techSpecification = techSpecification;
        this.productSet = productSet;
        this.category = category;
        this.isDeleted = isDeleted;
        this.cartList = cartList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(Double originPrice) {
        this.originPrice = originPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechSpecification() {
        return techSpecification;
    }

    public void setTechSpecification(String techSpecification) {
        this.techSpecification = techSpecification;
    }

    public String getProductSet() {
        return productSet;
    }

    public void setProductSet(String productSet) {
        this.productSet = productSet;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
