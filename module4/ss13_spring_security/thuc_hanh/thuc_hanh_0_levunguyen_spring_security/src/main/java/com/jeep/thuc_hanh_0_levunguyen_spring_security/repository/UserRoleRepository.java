package com.jeep.thuc_hanh_0_levunguyen_spring_security.repository;

import com.jeep.thuc_hanh_0_levunguyen_spring_security.entity.AppUser;
import com.jeep.thuc_hanh_0_levunguyen_spring_security.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
    List<UserRole> findByAppUser (AppUser appUser);
}
