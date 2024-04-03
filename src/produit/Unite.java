package produit;

public enum Unite {
	LITRE("l"),
	GRAMME("g"),
	KILOGRAMME("kg"),
	CENTILITRE("cl"),
	MILLILITRE("ml"),
	PIECE("");
	
	private final String nom;
	
	private Unite(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
}
