package entite;

public class Artiste {

	// ATTRIBUTS
	private String nom;
	private String prenom;
	private String nomDeScene;
	private int age;

	// constructeur par défaut
	public Artiste() {

	}
	
	public Artiste(String nom, String prenom, String nomDeScene, int age) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setNomDeScene(nomDeScene);
		this.setAge(age);
	}
	
	public void anniversaire() {
		int nouvelAge = this.getAge() + 1 ;
		this.setAge(nouvelAge);
	}
	
	//GETTER & SETTER
	public String getNom() {
		return this.nom;
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

	public String getNomDeScene() {
		return nomDeScene;
	}

	public void setNomDeScene(String nomDeScene) {
		this.nomDeScene = nomDeScene;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.getNomDeScene();
	}
	
}
