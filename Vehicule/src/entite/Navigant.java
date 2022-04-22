package entite;

public class Navigant extends Vehicule {
	
	//ATTRIBUTS
	public String categorie;
	
	//CONSTRUCTEUR
	public Navigant () {
		
	}
	
	public Navigant (String categorie) {
		this.categorie = categorie;
	}
	
	//METHODES
	public void naviguer() {
		System.out.println("splash splash");
	}

	//GETTER & SETTER
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	
}
