package app.entity.imc;


@FunctionalInterface
public interface IIMC {
	
	IMCResult calcImc(double wg, double ht);

}
