package com.calculator.service.impl;

import com.calculator.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {
    @Override
    public double doCalculate(int number1, int number2, String operator) {
        double result = 0;
        switch (operator) {
            case "add":
                result = number1 + number2;
                break;
            case "subtract":
                result = number1 - number2;
                break;
            case "multiple":
                result = number1 * number2;
                break;
            case "divide":
                try {
                    result = number1 / number2;
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
                break;
        }
        return result;
    }
}
