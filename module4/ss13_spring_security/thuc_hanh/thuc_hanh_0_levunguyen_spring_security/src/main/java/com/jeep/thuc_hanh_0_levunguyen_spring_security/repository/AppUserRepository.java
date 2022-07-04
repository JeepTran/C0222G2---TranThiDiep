package com.jeep.thuc_hanh_0_levunguyen_spring_security.repository;

import com.jeep.thuc_hanh_0_levunguyen_spring_security.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {
AppUser findByUserName(String userName);

}
