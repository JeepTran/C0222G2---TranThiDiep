package com.jeep.shoponlineapi.model;

import javax.persistence.*;

@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private AppRole appRole;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private AppUser appUser;

    public UserRole() {
    }

    public UserRole(Boolean isDeleted, AppRole appRole, AppUser appUser) {
        this.isDeleted = isDeleted;
        this.appRole = appRole;
        this.appUser = appUser;
    }

    public UserRole(Integer id, Boolean isDeleted, AppRole appRole, AppUser appUser) {
        this.id = id;
        this.isDeleted = isDeleted;
        this.appRole = appRole;
        this.appUser = appUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public AppRole getAppRole() {
        return appRole;
    }

    public void setAppRole(AppRole appRole) {
        this.appRole = appRole;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }
}
