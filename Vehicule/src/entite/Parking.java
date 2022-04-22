package entite;

import java.util.ArrayList;
import java.util.List;

public class Parking {
	//ATTRIBUTS
	private String nom;
	private List<Roulant> listeRoulantAutorise;
	
	//CONSTRUCTEUR
	public Parking() {
		this.init();
	}
	
	public Parking(String nom) {
		this.setNom(nom);
		this.init();
	}

	//METHODES
	
	public void init() {
		this.listeRoulantAutorise = new ArrayList<>();
	}
	
	public void ajoutRoulant(Roulant vehicule) {
		listeRoulantAutorise.add(vehicule);
	}
	
	
	//GETTER & SETTER
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Roulant> getListeRoulantAutorise() {
		return listeRoulantAutorise;
	}

	public void setListeVehiculeAutorise(List<Roulant> listeRoulantAutorise) {
		this.listeRoulantAutorise = listeRoulantAutorise;
	}
	
	
	

}
