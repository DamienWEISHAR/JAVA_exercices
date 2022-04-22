package entite;

public class JoueurTennis extends Tennis {
	
	//ATTRIBUTS
	private String nom;
	private String prenom;
	private String pays;
	private int age;
	
	
	//CONSTRUCTEUR
	public JoueurTennis(String nom, String prenom, String nationalite, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.pays = nationalite;
		this.age = age;
	}
	
	//METHODES
	@Override
	public String toString () {
		return this.getPrenom() +" " +this.getNom() + " est un joueur de " 
				+this.getNationalite() + " âgé de "+this.getAge()+" ans!";
	}
	
	//GETTER et SETTER
	
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
	public String getNationalite() {
		return pays;
	}
	public void setNationalite(String nationalite) {
		this.pays = nationalite;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
