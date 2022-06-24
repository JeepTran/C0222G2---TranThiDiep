package com.jeep.bai_tap_1_validate_form.repository;

import com.jeep.bai_tap_1_validate_form.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
