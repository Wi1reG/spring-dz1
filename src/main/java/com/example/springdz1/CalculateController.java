package com.example.springdz1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculateController {
    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public String hello() {
        return calculateService.hello();
    }

    @GetMapping(path = "/calculate")
    public String helloCalcualte() {
        return calculateService.helloCalcualte();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return calculateService.plus(a,b);

    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return calculateService.minus(a,b);


    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return calculateService.multiply(a,b);

    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return calculateService.divide(a,b);

    }

}
