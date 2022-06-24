package com.jeep.bai_tap_1_validate_form.service;

import com.jeep.bai_tap_1_validate_form.model.User;

import java.util.List;

public interface IUserService {

    User save (User user);

    List<User> findAll();
}
