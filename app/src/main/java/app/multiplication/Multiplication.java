package app.multiplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Multiplication {
	
	public double multiply(double a, double b) {

		double res = 0;

		if (b > 0) {
			for (int i=0; i < b; i+=1) {
				res+= a;
			}
		} else {
			for (int i=0; i > b; i-=1) {
				res-= a;
			}
		}

		return res;
	}
	
	
	public double negative(double num) {
		return this.multiply(num, -1);
	}
}
