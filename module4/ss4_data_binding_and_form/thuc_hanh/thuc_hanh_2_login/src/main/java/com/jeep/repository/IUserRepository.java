package com.jeep.repository;

import com.jeep.model.Login;
import com.jeep.model.User;

public interface IUserRepository {
     User checkLogin(Login login);
}
