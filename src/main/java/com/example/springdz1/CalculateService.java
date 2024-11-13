package com.example.springdz1;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class CalculateService {

    public String hello(){
        return "Привет";
    }

    public String helloCalcualte() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        if (a == null || b == null) {
            return "Оба параметра должны быть поданы.";
        }
        int sum = a + b;
        return a + " + " + b + " = " + sum;


    }

    public String minus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        if (a == null || b == null) {
            return "Оба параметра должны быть поданы.";
        }
        int sum = a - b;
        return a + " - " + b + " = " + sum;

    }

    public String multiply(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        if (a == null || b == null) {
            return "Оба параметра должны быть поданы.";
        }
        int sum = a * b;
        return a + " * " + b + " = " + sum;


    }

    public String divide(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        if (a == null || b == null) {
            return "Оба параметра должны быть поданы.";
        }
        if (a == 0 || b == 0) {
            return "На ноль делить нельзя";
        }
        int sum = a / b;
        return a + " / " + b + " = " + sum;


    }
}
