package entite;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {

	// ATTRIBUTS
	private List<Pokemon> listeDesPokemon; //list <objet que l'on veut dans la liste> nomVariableDeLaListe

	// CONSTRUCTEUR
	public Pokedex() {
		this.init();
	}

	//METHODES
	private void init() {
		this.listeDesPokemon = new ArrayList<Pokemon>(); //permet d'initialiser (ouvrir le pokédex) en créant un nouvel objet de type ArrayList
	}
	
	public void ajouterPokemon(Pokemon pkmn) {
		this.listeDesPokemon.add(pkmn);
	}
	
	
	
	
	// GETTER & SETTER
	public List<Pokemon> getListeDesPokemon() {
		return listeDesPokemon;
	}

	public void setListeDesPokemon(List<Pokemon> listeDesPokemon) {
		this.listeDesPokemon = listeDesPokemon;
	}
}
