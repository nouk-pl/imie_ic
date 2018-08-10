package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Result;
import app.service.DivisionService;

@RequestMapping(path = "api/division")
@RestController
public class DivisionApi {
	
	@Autowired
	private DivisionService divisionService;
	
	@GetMapping
    public Result multiply(
    		@RequestParam(value="num1") double num1,
    		@RequestParam(value="num2") double num2) {
        return this.divisionService.divide(num1, num2);
    }

}
