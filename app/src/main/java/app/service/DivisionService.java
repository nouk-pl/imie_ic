package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.division.Division;
import app.entity.Result;

@Service
public class DivisionService {
	
	
	@Autowired
	private Division division;

	public Result divide(double num1, double num2) {
		double nbResult = this.division.divide(num1, num2);
		return new Result(num1, num2, "DIVISION", nbResult);
	}

}
