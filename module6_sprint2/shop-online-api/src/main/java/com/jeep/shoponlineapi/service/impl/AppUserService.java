package com.jeep.shoponlineapi.service.impl;

import com.jeep.shoponlineapi.model.AppUser;
import com.jeep.shoponlineapi.repository.IAppUserRepository;
import com.jeep.shoponlineapi.service.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService implements IAppUserService {

    @Autowired
    private IAppUserRepository IAppUserRepository;


    @Override
    public AppUser findAppUserByUsername(String username) {
        return this.IAppUserRepository.findAppUserByUserName(username);
    }


    @Override
    public void updatePassword(AppUser appUser) {
        this.IAppUserRepository.updatePassword(appUser);
    }
}
