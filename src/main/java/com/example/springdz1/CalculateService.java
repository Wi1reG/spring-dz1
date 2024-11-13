package com.example.springdz1;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculateService {



    public String helloCalcualte() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Integer a, Integer b) {
        if (a == null || b == null) {
            return eror();

        }
        int sum = a + b;
        return a + " + " + b + " = " + sum;


    }

    public String minus(Integer a, Integer b) {
        if (a == null || b == null) {
            return eror();

        }
        int sum = a - b;
        return a + " - " + b + " = " + sum;

    }

    public String multiply(Integer a, Integer b) {
        if (a == null || b == null) {
            return eror();

        }
        int sum = a * b;
        return a + " * " + b + " = " + sum;


    }

    public String divide(Integer a, Integer b) {
        if (a == null || b == null) {
            return eror();
        }
        if (a == 0 || b == 0) {
            return "На ноль делить нельзя";
        }
        int sum = a / b;
        return a + " / " + b + " = " + sum;


    }

    public String eror() {
        return "Ошибка. Оба параметра должны быть поданы";
    }
}
