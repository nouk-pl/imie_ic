package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Result;
import app.service.MultiplicationService;
;

@RequestMapping(path = "/api/multiplication")
@RestController
public class MultiplicationApi {
	
	@Autowired
	private MultiplicationService multiplicationService;
	
	@GetMapping()
    public Result multiply(
    		@RequestParam(value="num1") double num1,
    		@RequestParam(value="num2") double num2) {
        return multiplicationService.multiply(num1, num2);
    }
	
	@GetMapping(path = "/negative")
    public Result negative(
    		@RequestParam(value="num") double num) {
        return multiplicationService.negative(num);
    }
}
