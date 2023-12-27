package com.example.springpractice2.controller;
import com.example.springpractice2.dto.CalculatorDTO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")//class level mapping of url to a controller class
public class CalculatorController {

    //http://localhost:8080/api/calculator/add
    
    
    
    //http://localhost:8080/api/calculator/add?num1=6.7&num2=1.3


    // http://localhost:8080/api/calculator/add?num1=2&num2=3
    @GetMapping("/add")                    //method level mapping of a url to a controller function
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2){
        return num1+num2;
    }


    //http://localhost:8080/api/calculator/sub/6.7/1.3
    @GetMapping("/sub/{num111}/{num2}")    //Map the values of url to java variables by Path variable method
    public Double substract(@PathVariable("num111") Double num1, @PathVariable("num2") Double num2){
        Double result = null;
        if(num1>num2){
            result = num1-num2;
        }else{
            result = num2-num1;
        }
        return result;
    }

    // http://localhost:8080/api/calculator/add/5?num1=2&num2=3
    @GetMapping("/add/{num3}") //method level mapping of a url to a controller function
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2,
                      @PathVariable("num3") Double num3){
        return num1+num2;
    }

    // http://localhost:8080/api/calculator/mult    // include json in response body
    @PostMapping("/mult")
    public Double multiply(@RequestBody CalculatorDTO calculatorDTO){
        Double result = null;
        result = calculatorDTO.getNum1() * calculatorDTO.getNum2() * calculatorDTO.getNum3() * calculatorDTO.getNum4();
        return result;
    }

     // http://localhost:8080/api/calculator/mul    // include json in response body
    @PostMapping("/mul")
    public ResponseEntity<Double> multiply1(@RequestBody CalculatorDTO calculatorDTO){
        Double result = null;
        result = calculatorDTO.getNum1() * calculatorDTO.getNum2() * calculatorDTO.getNum3() * calculatorDTO.getNum4();
        ResponseEntity<Double> responseEntity = new ResponseEntity<Double>(result, HttpStatus.CREATED);
        return responseEntity;
    }
}


/*

JSON = {
  "num1":23.4,
  "num2":13.4,
  "num3":0.5,
  "num41":2.45
}


*/