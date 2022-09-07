package com.jeep.shoponlineapi.repository;

import com.jeep.shoponlineapi.model.AppUser;
import com.jeep.shoponlineapi.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUserRoleRepository extends JpaRepository<UserRole, Integer> {

    @Query(value = " select ur.id, ur.is_deleted, ur.role_id, ur.user_id from user_role ur where user_id = :#{#appUser.id} ", nativeQuery = true)
    List<UserRole> findAllByAppUser(@Param("appUser") AppUser appUser);
}
