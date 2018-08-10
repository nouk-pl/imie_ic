package app.division;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.controller.MultiplicationApi;
import app.multiplication.Multiplication;

@Component
public class Division {
	
	@Autowired
	private MultiplicationApi multiplicationApi;
	
//	@Autowired
//	public Division(MultiplicationApi multiplicationApi) {
//		this.multiplicationApi = multiplicationApi;
//	}
	
	public double divide(double a, double b) throws IllegalArgumentException {

		if (b == 0) {
			throw new IllegalArgumentException("Impossible to divide by zero");
		}

		if (a < 0) {
			b = -b;
			double res = multiplicationApi.negative(a).getResult();
			a = res;
		}

		double res = 0;
		double absb = Math.abs(b);
		double btmp = absb;

		while (btmp <= a) {
			btmp += absb;
			res += 1;
		}

		return b > 0 ? res : -res;
	}

}
