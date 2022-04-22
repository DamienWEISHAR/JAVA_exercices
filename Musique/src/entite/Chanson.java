package entite;

import java.util.ArrayList;
import java.util.List;

public class Chanson {
	
	//ATTRIBUTS
	private String titre;	
	//private Artiste chanteur;
	//private Artiste auteur;
	
	private List<Artiste> listeDesChanteurs;
	private List<Artiste> listAuteurs;
	
	
	
	//CONSTRUCTEUR
	public Chanson(String titre) {
		this.titre = titre;
		this.listeDesChanteurs = new ArrayList<Artiste>();
		this.listAuteurs = new ArrayList<Artiste>();
	}
	
	
	public void ajoutChanteur(Artiste chanteur) {
		this.listeDesChanteurs.add(chanteur);
	}
	
	public void ajoutAuteur(Artiste auteur) {
		this.listAuteurs.add(auteur);
	}
	
	
	//GETTER & SETTER 
	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}

	/*public Artiste getChanteur() {
		return chanteur;
	}

	public void setChanteur(Artiste chanteur) {
		this.chanteur = chanteur;
	}

	public Artiste getAuteur() {
		return auteur;
	}

	public void setAuteur(Artiste auteur) {
		this.auteur = auteur;
	}
*/

	public List<Artiste> getListeDesChanteurs() {
		return listeDesChanteurs;
	}

	public void setListeDesChanteurs(List<Artiste> listeDesChanteurs) {
		this.listeDesChanteurs = listeDesChanteurs;
	}

	public List<Artiste> getListAuteurs() {
		return listAuteurs;
	}

	public void setListAuteurs(List<Artiste> listAuteurs) {
		this.listAuteurs = listAuteurs;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getTitre();
	}

	
	
}
