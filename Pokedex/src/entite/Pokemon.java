package entite;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {

	// ATTRIBUTS
	private String nom;
	private List<Type> type;
	private boolean shiny;
	private int pv;
	private int attaque;
	private int vitesse;

	// CONSTRUCTEUR
	public Pokemon() {
		this.init();
	}
	
	private void init() {
		
		this.type = new ArrayList<Type>();
		this.setShiny(false);
	}
	
	public void ajouterType(Type type) {
		this.type.add(type);
	}

	// METHODES

	@Override
	public String toString() {
		return this.getNom();
	}

	
	
	// GETTER & SETTER
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Type> getType() {
		return this.type;
	}

	public void setType(List<Type> type) {
		this.type = type;
	}

	public boolean getShiny() {
		return this.shiny;
	}

	public void setShiny(boolean shiny) {
		this.shiny = shiny;
	}
	
	public int getPv() {
		return this.pv;
	}
	 public void setPv(int pv) {
		 this.pv = pv;
	 }
	
	 public int getAttaque() {
		 return this.attaque;
	 }
	 
	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}
	
	public int getVitesse () {
		return this.vitesse;
	}
	
	public void setVitesse (int vitesse) {
		this.vitesse = vitesse;
	}
	
}
