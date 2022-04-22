package entite;

import java.util.ArrayList;
import java.util.List;

public class Album {
	//Attributs
	private String titre;
	private Artiste artiste;
	private List<Chanson> listeDesTitres;
	
	//CONSTRUCTEUR
	public Album() {
		this.init();
	}

	public Album (String titre) {
		this.setTitre(titre);
		this.init();
	}
	
	//METHODES
	
	public void init() {
		this.listeDesTitres = new ArrayList<>();
	}
	
	public void ajoutChanson(Chanson titre) {
		listeDesTitres.add(titre);
		
		System.out.println("ajout de la chanson " + titre);
	}
	
	
	
	//GETTER & SETTER
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Artiste getArtiste() {
		return artiste;
	}

	public void setArtiste(Artiste artiste) {
		this.artiste = artiste;
	}

	public List<Chanson> getListeDesTitres() {
		return listeDesTitres;
	}

	public void setListeDesTitres(List<Chanson> listeDesTitres) {
		this.listeDesTitres = listeDesTitres;
	}
	
}
