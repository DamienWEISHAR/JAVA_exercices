package entite;

public abstract class Personne {
	//ATTRIBUTS
	private String nom;
	private String prenom;
	private int age;
	private double tva;
	private double prixPanier;
	
	//CONSTRUCTEUR
	public Personne() {
		
	}
	
	//METHODES
	public double calculerPanier() {
		return 0;
	}
	
	protected double calculPanierTTC() {
		return this.getPrixPanier() * (this.getTva()/100);
	}
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getTva() {
		return tva;
	}
	public void setTva(double tva) {
		this.tva = tva;
	}
	public double getPrixPanier() {
		return prixPanier;
	}
	public void setPrixPanier(double prixPanier) {
		this.prixPanier = prixPanier;
	}
}
