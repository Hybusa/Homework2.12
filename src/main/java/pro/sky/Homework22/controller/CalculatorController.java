package pro.sky.Homework22.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.Homework22.service.CalculatorService;

@RestController
@RequestMapping("calculator")
public class CalculatorController {


    CalculatorService calculatorService;


    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String start(){
        return "Welcome to the calculator";
    }

    @GetMapping("plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.divide(num1, num2);
    }

    @ExceptionHandler({IllegalArgumentException.class})
    public String handleException(Exception e){
        return e.getMessage();
    }
}
