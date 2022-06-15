package com.currency.service.impl;

import com.currency.service.ICurrencyService;
import org.springframework.stereotype.Service;

@Service
public class CurrencyServiceImpl implements ICurrencyService {
    @Override
    public double exchange(double usd, double rate) {
        return usd * rate;
    }
}
