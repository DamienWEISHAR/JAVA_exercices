//mport entite.JoueurTennis;
import entite.Tournoi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		JoueurTennis djokovic = new JoueurTennis("Djokovic", "Novak", "Serbie", 35);
		System.out.println(djokovic);
		JoueurTennis nadal = new JoueurTennis("Nadal", "Rafael", "Espagne", 36);
		System.out.println(nadal);
		*/

		// -------------------------------------
		
		Tournoi rolandGarros = new Tournoi("Roland Garros", "terre battue");
		System.out.println(rolandGarros);
		Tournoi wimbledon = new Tournoi("Wimbledon", "gazon");
		System.out.println(wimbledon);
		Tournoi usOpen = new Tournoi("Us Open", "dur");
		System.out.println(usOpen);
		Tournoi openAustralie = new Tournoi("Open d'Australie", "dur");
		System.out.println(openAustralie);
	}

};
