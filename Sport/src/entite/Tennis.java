package entite;

import java.util.ArrayList;
import java.util.List;

public abstract class Tennis extends Sport {
	
	//ATTRIBUTS
	protected List<TournoiTennis> listeTournois;
	protected List<JoueurTennis> listeJoueurs;

	
	//CONSTRUCTEUR
	public Tennis() {
		this.initPlayer(); //permet d'initialiser la liste, de l'ouvrir
		this.initTournament();
	}
	
	
	//METHODES
	private void initPlayer() {
		this.listeJoueurs = new ArrayList<JoueurTennis>(); //permet d'initialiser en créant un nouvel objet de type ArrayList
	}
	
	private void initTournament() {
		this.listeTournois = new ArrayList<TournoiTennis>();
	}
	
	public void addPlayer() {
		//à remplir
	}
	
	public void addTournament() {
		//à remplir
	}
	
	
	//GETTER & SETTER
	public List<JoueurTennis> getListeJoueurs() {
		return listeJoueurs;
	}
	public void setListeJoueurs(List<JoueurTennis> listeJoueurs) {
		this.listeJoueurs = listeJoueurs;
	}
	public List<TournoiTennis> getListeTournois() {
		return listeTournois;
	}
	public void setListeTournois(List<TournoiTennis> listeTournois) {
		this.listeTournois = listeTournois;
	}
	
	
	
	
}
