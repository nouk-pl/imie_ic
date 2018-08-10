package app.entity.imc;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IMCResult {
	
	
	private double weight;
	private double height;
	private double imc;
	private int category;
	private String libelle;
	
};
