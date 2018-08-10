package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Result;
import app.multiplication.Multiplication;

@Service
public class MultiplicationService {
	
	@Autowired
	private Multiplication multiplication;
	
	
	public Result multiply(double num1, double num2) {
		double result = multiplication.multiply(num1, num2);
		return new Result(num1, num2, "MULTIPLICATION", result);
	}

	public Result negative(double num) {
		double result = multiplication.negative(num);
		return new Result(num, -1, "MULTIPLICATION", result);
	}

}
