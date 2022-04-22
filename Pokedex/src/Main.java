import controler.Combat;
import entite.Pokedex;
import entite.Pokemon;
import entite.Type;

public class Main {

	public static void main(String[] args) {
		
		Pokemon bulbizarre = new Pokemon();
		bulbizarre.setNom("Bulbizarre");
		System.out.println(bulbizarre.getNom());
		bulbizarre.ajouterType(Type.PLANTE);
		System.out.println(bulbizarre.getType());
		bulbizarre.setPv(3000);
		bulbizarre.setAttaque(1500);
		bulbizarre.setVitesse(15);
		
		
		Pokemon salameche = new Pokemon();
		salameche.setNom("Salamèche");
		System.out.println(salameche.getNom());
		salameche.ajouterType(Type.FEU);
		System.out.println(salameche.getType());
		salameche.setPv(3500);
		salameche.setAttaque(1000);
		salameche.setVitesse(16);
		
		
		/*
		Pokemon carapuce = new Pokemon();
		carapuce.setNom("Carapuce");
		System.out.println(carapuce.getNom());
		carapuce.ajouterType(Type.EAU);
		System.out.println(carapuce.getType());
		*/
		
		
		Pokedex pokedex = new Pokedex();
		
		pokedex.ajouterPokemon(bulbizarre);
		pokedex.ajouterPokemon(salameche);
		//pokedex.ajouterPokemon(carapuce);
		
		System.out.println(pokedex.getListeDesPokemon());
		
		
		
		Combat duel = new Combat();
		duel.ajouterCombattant(salameche);
		duel.ajouterCombattant(bulbizarre);
		
		duel.fight();
		
		
		
		
	}

}
