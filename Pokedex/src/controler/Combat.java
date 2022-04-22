package controler;

import java.util.ArrayList;
import java.util.List;

import entite.Pokemon;

public class Combat {

	// ATTRIBUTS
	private List<Pokemon> combattants;
	private boolean combatEnCours = true;

	// CONSTRUCTEUR
	public Combat() {
		this.init();
	}

	// METHODES
	private void init() {
		this.combattants = new ArrayList<Pokemon>();
	}

	public void ajouterCombattant(Pokemon combattant) {
		this.combattants.add(combattant);
	}

	public void fight() {
		int round = 0;
		while (combatEnCours) {
			round++;
			System.out.println("\n");
			System.out.println("DEBUT ROUND " + round);
			this.round();
		}
	}

	public void round() {
		Pokemon pokemonAttaquant = this.whoStart();
		Pokemon pokemonDefenseur = this.whoReceivedDamages(pokemonAttaquant);
		this.fightPokemons(pokemonAttaquant, pokemonDefenseur);
		this.fightPokemons(pokemonDefenseur, pokemonAttaquant);

		// System.out.println("pokemonAttaquant = " + pokemonAttaquant + " PV = " +
		// pokemonAttaquant.getPv());
		// System.out.println("pokemonDefenseur = " + pokemonDefenseur + " PV = " +
		// pokemonDefenseur.getPv());
	}

	private void fightPokemons(Pokemon attaquant, Pokemon defenseur) {
		if (attaquant.getPv() > 0 && defenseur.getPv() > 0) {
			int degats = this.degatsGeneres(attaquant);
			int pvDefenseur = defenseur.getPv();

			pvDefenseur = pvDefenseur - degats;
			if (pvDefenseur < 0) {
				pvDefenseur = 0;
				this.combatEnCours = false;
			}
			
			defenseur.setPv(pvDefenseur);

			System.out.println(attaquant.getNom() + " attaque " + defenseur.getNom() + " avec un dégat de [" + degats
					+ "] laissant l'adversaire avec [" + defenseur.getPv() + "]");
		} else {
			this.combatEnCours = false;
		}

	}

	private Pokemon whoStart() {
		Pokemon plusRapide = this.combattants.get(0);
		for (int i = 0; i < this.combattants.size(); i++) {
			Pokemon pokemonEnCours = this.combattants.get(i);
			if (pokemonEnCours.getVitesse() > plusRapide.getVitesse()) {
				plusRapide = pokemonEnCours;
			}
		}
		return plusRapide;
	}

	private Pokemon whoReceivedDamages(Pokemon attaquant) {
		int indexAttaquant = this.combattants.indexOf(attaquant);
		if (indexAttaquant == 0) {
			return this.combattants.get(1);
		} else {
			return this.combattants.get(0);
		}
	}

	private int degatsGeneres(Pokemon pokemonAttaquant) {
		int degats = (int) (Math.random() * pokemonAttaquant.getAttaque());
		return degats;
	}

	// GETTER & SETTER
	public List<Pokemon> getCombattants() {
		return combattants;
	}

	public void setCombattants(List<Pokemon> combattants) {
		this.combattants = combattants;
	}

}
