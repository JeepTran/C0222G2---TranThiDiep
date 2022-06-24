package com.jeep.bai_tap_1_validate_form.service.impl;

import com.jeep.bai_tap_1_validate_form.model.User;
import com.jeep.bai_tap_1_validate_form.repository.IUserRepository;
import com.jeep.bai_tap_1_validate_form.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
