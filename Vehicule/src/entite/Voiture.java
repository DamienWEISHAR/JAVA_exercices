package entite;

public class Voiture extends Roulant {

	// ATTRIBUTS
	private int nombreDeRoues;

	// CONSTRUCTEUR
	public Voiture(int nombreDeRoues) {
		this.nombreDeRoues = nombreDeRoues;
	}
	
	//METHODES
	
	@Override
	public String toString() {
		return this.getNom();
	}
	
	
	
	

	// GETTER & SETTER
	public int getNombreDeRoues() {
		return nombreDeRoues;
	}

	public void setNombreDeRoues(int nombreDeRoues) {
		this.nombreDeRoues = nombreDeRoues;
	}

}
