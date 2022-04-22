package entite;

public abstract class Roulant extends Vehicule {

	// ATTRIBUTS

	protected String typeDeCarburant;
	protected int vitesseMax;

	// CONSTRUCTEUR
	public Roulant() {

	}
	
	//METHODES
	
	public void demarrer() {
		System.out.println("VROUM VROUM");
	}

	// GETTER & SETTER

	public String getTypeDeCarburant() {
		return typeDeCarburant;
	}

	public void setTypeDeCarburant(String typeDeCarburant) {
		this.typeDeCarburant = typeDeCarburant;
	}

	public int getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

}
