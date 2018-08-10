package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.entity.imc.IMCResult;
import app.service.IMCService;

@RequestMapping(path = "api/imc")
@RestController
public class IMCApi {
	
	@Autowired
	private IMCService imcService;
	
	
	@GetMapping
	public IMCResult getImc(
			@RequestParam(value="wg") double wg,
    		@RequestParam(value="ht") double ht) {
		
		return imcService.calcImc(wg, ht);
		
	}

}
