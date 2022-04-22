package entite;


import java.util.ArrayList;
import java.util.List;

public abstract class Sport {
	// ATTRIBUTS
	protected String nom;
	protected List<Type> typeDeSport;

	// CONSTRUCTEUR
	public Sport() {
		this.init();
	}

	public Sport(String nom) {
		this.init();
		this.nom = nom;
	}

	// METHODES
	private void init() {
		this.typeDeSport = new ArrayList<Type>();
	}
	
	public void ajouterType(Type typeDeSport) {
		this.typeDeSport.add(typeDeSport);
	}
	
	

	// GETTER & SETTER
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Type> getTypeDeSport() {
		return typeDeSport;
	}

	public void setTypeDeSport(List<Type> typeDeSport) {
		this.typeDeSport = typeDeSport;
	}

}
