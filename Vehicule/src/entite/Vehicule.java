package entite;

public abstract class Vehicule {
	
	//ATTRIBUTS
	protected String nom;
	protected String marque;
	
	//CONSTRUCTEUR
	public Vehicule() {
		
	}
	
	public Vehicule (String nom, String marque) {
		this.nom = nom;
		this.marque = marque;
	}

	
	/*
	@Override
	public String toString() {
		return this.getNom()+" est de la marque "+ this.getMarque()+".";
	}
	*/
	
	//GETTER & SETTER
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
}
