package produit;

public class Poisson extends Produit {
	private String date; 
	
	public Poisson(String date) {
		super("poisson", Unite.PIECE);
		this.date = date;
	}

	@Override
	public void descriptionProduit() {
		System.out.println(getNom() + "pêchés" + date);
	}
}
