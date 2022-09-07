package com.jeep.shoponlineapi.util;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class LoginUtil {
    private Map<String, String> tokenMap = new HashMap<>();

    public LoginUtil() {
    }

    public LoginUtil(Map<String, String> tokenMap) {
        this.tokenMap = tokenMap;
    }

    public Map<String, String> getTokenMap() {
        return tokenMap;
    }

    public void setTokenMap(Map<String, String> tokenMap) {
        this.tokenMap = tokenMap;
    }
}
