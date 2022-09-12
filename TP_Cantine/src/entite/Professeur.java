package entite;

public class Professeur extends Personne {
	//ATTRIBUTS
	private int anciennete;
	
	//CONSTRUCTEUR
	public Professeur() {
		
	}
	
	//METHODES
	@Override
	public double calculerPanier() {
		double calculPanier = this.calculPanierTTC();
		calculPanier = calculPanier - ((double)this.getAnciennete()*3)/100;
		return calculPanier;
	}

	//GETTER SETTER
	public int getAnciennete() {
		return anciennete;
	}

	public void setAnciennete(int anciennete) {
		this.anciennete = anciennete;
	}
	
	
}
