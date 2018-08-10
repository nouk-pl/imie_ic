package app.entity.imc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.division.Division;
import app.multiplication.Multiplication;

@Component
public class IMCEngine implements IIMC {

	@Autowired
	private Division division;

	@Autowired
	private Multiplication multiplication;

	@Override
	public IMCResult calcImc(double wg, double ht) {

		double heightSquare = multiplication.multiply(ht, ht);		
		double imc = division.divide(wg, heightSquare);
		IMCCategory imcCat = getCategoryFromImc(imc);
		return new IMCResult(wg, ht, imc, imcCat.getCategory(), imcCat.getlibelle());
	}

	private IMCCategory getCategoryFromImc(double imc) {

		if (imc < 16.5) {
			return IMCCategory.FAMINE;
		} else if (imc < 18.5) {
			return IMCCategory.MAIGREUR;
		} else if (imc < 25) {
			return IMCCategory.NORMAL;
		} else if (imc < 30) {
			return IMCCategory.SURPOIDS;
		} else if (imc < 35) {
			return IMCCategory.OBESITE_MODEREE;
		} else if (imc < 40) {
			return IMCCategory.OBESITE_SEVERE;
		} else {
			return IMCCategory.OBESITE_MASSIVE;
		}
	}

}
