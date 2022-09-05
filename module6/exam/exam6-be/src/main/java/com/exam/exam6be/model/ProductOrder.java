package com.exam.exam6be.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String customer;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    Product product;

    Integer quantity;

    Date orderDate;

    Double total;

    Boolean isDeleted;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductOrder productOrder = (ProductOrder) o;
        return id != null && Objects.equals(id, productOrder.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }


}
