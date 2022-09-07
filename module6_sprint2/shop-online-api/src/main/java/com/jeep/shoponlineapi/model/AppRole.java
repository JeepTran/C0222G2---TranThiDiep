package com.jeep.shoponlineapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class AppRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String roleName;

    @OneToMany(mappedBy = "appRole")
    @JsonIgnore
    private List<UserRole> userRoleList;

    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;

    public AppRole() {
    }

    public AppRole(String roleName, List<UserRole> userRoleList, Boolean isDeleted) {
        this.roleName = roleName;
        this.userRoleList = userRoleList;
        this.isDeleted = isDeleted;
    }

    public AppRole(Integer id, String roleName, List<UserRole> userRoleList, Boolean isDeleted) {
        this.id = id;
        this.roleName = roleName;
        this.userRoleList = userRoleList;
        this.isDeleted = isDeleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<UserRole> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRole> userRoles) {
        this.userRoleList = userRoles;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
