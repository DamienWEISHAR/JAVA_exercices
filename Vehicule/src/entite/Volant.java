package entite;

public class Volant extends Vehicule {
	//ATTRIBUTS
	private String categorie;
	
	//CONSTRUCTEUR
	public Volant() {
		
	}
	
	public Volant (String categorie) {
		
		this.categorie = categorie;
	}

	
	
	//GETTER & SETTER
	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
}
