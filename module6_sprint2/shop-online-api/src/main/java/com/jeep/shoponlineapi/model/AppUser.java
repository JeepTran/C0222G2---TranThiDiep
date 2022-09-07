package com.jeep.shoponlineapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    private Date creationDate;

    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;

    @OneToMany(mappedBy = "appUser")
    @JsonIgnore
    private List<UserRole> userRoleList;

    @OneToOne(mappedBy = "appUser")
    @JsonIgnore
    private Customer customer;

    public AppUser() {
    }

    public AppUser(String userName, String password, Date creationDate, Boolean isDeleted, List<UserRole> userRoles) {
        this.userName = userName;
        this.password = password;
        this.creationDate = creationDate;
        this.isDeleted = isDeleted;
        this.userRoleList = userRoles;
    }

    public AppUser(Integer id, String userName, String password, Date creationDate, Boolean isDeleted, List<UserRole> userRoles) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.creationDate = creationDate;
        this.isDeleted = isDeleted;
        this.userRoleList = userRoles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public List<UserRole> getUserRoles() {
        return userRoleList;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoleList = userRoles;
    }
}
