package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {
	
	private double num1;
	private double num2;
	private String operation;
	private double result;
	
}
