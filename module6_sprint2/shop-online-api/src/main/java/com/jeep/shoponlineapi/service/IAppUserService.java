package com.jeep.shoponlineapi.service;




import com.jeep.shoponlineapi.model.AppUser;

import java.util.List;

public interface IAppUserService {

    AppUser findAppUserByUsername(String username);

    void updatePassword(AppUser appUser);
}
