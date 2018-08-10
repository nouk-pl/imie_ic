package app.entity.imc;

public enum IMCCategory {

	OBESITE_MASSIVE(1, "Obésité morbide ou massive"), OBESITE_SEVERE(2, "Obésité sévère"),
	OBESITE_MODEREE(3, "Obésité modérée"), SURPOIDS(4, "Surpoids"), NORMAL(5, "Corpulence normale"),
	MAIGREUR(6, "Maigreur"), FAMINE(7, "Famine");

	/** L'attribut qui contient la valeur associé à l'enum */
	private final int category;
	private final String libelle;

	/** Le constructeur qui associe une valeur à l'enum */
	private IMCCategory(int category, String libelle) {
		this.category = category;
		this.libelle = libelle;
	}

	/** La méthode accesseur qui renvoit la valeur de l'enum */
	public int getCategory() {
		return this.category;
	}

	public String getlibelle() {
		return this.libelle;
	}

}
