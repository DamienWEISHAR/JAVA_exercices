package entite;

public class Tournoi {
	
	//ATTRIBUTS
	private String nom;
	private String surface;
	
	//CONSTRUCTEUR
	public Tournoi(String nom, String surface) {
		this.nom = nom;
		this.surface = surface;
	}

	//METHODES
	@Override
	public String toString() {
		return this.getNom() + " est un tournoi joué sur " + this.getSurface() + ".";
	}
	
	
	//GETTER & SETTER
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSurface() {
		return surface;
	}

	public void setSurface(String surface) {
		this.surface = surface;
	}
	
	
}
