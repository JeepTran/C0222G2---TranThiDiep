package com.jeep.service;

import com.jeep.model.Login;
import com.jeep.model.User;

public interface IUserService {
    User checkLogin(Login login);
}
