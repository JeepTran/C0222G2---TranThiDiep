package com.jeep.service.impl;

import com.jeep.model.Login;
import com.jeep.model.User;
import com.jeep.repository.IUserRepository;
import com.jeep.repository.impl.UserRepositoryImpl;
import com.jeep.service.IUserService;

public class UserServiceImpl implements IUserService {
    private IUserRepository userRepository = new UserRepositoryImpl();
    @Override
    public User checkLogin(Login login) {
        return userRepository.checkLogin(login);
    }
}
