package entite;

public class Moto extends Roulant {
	
	//ATTRIBUTS
	private int nombreDeRoues;
	
	// CONSTRUCTEUR
	public Moto(int nombreDeRoues) {
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
