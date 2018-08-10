package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.division.Division;
import app.entity.imc.IIMC;
import app.entity.imc.IMCResult;

@Service
public class IMCService {

	@Autowired
	private Division division;

	@Autowired
	private IIMC imc;

	public IMCResult calcImc(double wg, double ht) {
		return imc.calcImc(wg, ht);
	}

	
}
