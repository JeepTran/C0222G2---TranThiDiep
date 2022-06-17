package com.jeep.repository.impl;

import com.jeep.model.Login;
import com.jeep.model.User;
import com.jeep.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserRepositoryImpl implements IUserRepository {
    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User("john", "123456", "John", "john@gmail.com", 20));
        userList.add(new User("ken", "123456", "Ken", "ken@gmail.com", 21));
        userList.add(new User("james", "123456", "James", "james@gmail.com", 23));
        userList.add(new User("ada", "123456", "Ada", "ada@gmail.com", 22));
    }
@Override
    public User checkLogin(Login login) {
        for (User user : userList) {
            if (user.getAccount().equals(login.getAccount())
                    && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }

}
