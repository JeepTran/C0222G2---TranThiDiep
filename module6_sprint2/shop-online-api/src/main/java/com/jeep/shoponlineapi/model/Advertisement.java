package com.jeep.shoponlineapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(columnDefinition = "text")
    private String image;

    private Date createDate;

    private Date startDate;

    private Date endDate;

    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;

    public Advertisement() {
    }

    public Advertisement(Integer id, String name, String image, Date createDate,
                         Date startDate, Date endDate, Boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.createDate = createDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isDeleted = isDeleted;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
