package entite;

public class Eleve extends Personne {
	//ATTRIBUTS
	private int grade;
	
	
	
	//CONSTRUCTEUR
	public Eleve() {
		
	}

	
	//METHODES
	
	
	@Override
	public double calculerPanier() {
		double calculPanier = this.calculPanierTTC();
		calculPanier = calculPanier + (double) (this.getGrade()*10)/100;
		
		return calculPanier;
	}

	//GETTER SETTER
	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}
}
