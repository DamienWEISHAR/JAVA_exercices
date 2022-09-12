import java.util.ArrayList;
import java.util.List;

import entite.Eleve;
import entite.Personne;
import entite.Professeur;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tva = 19.6;
		double prixPanierEleve = 10;
		double prixPanierProf = 15;
		Eleve eleve1 = new Eleve();
		eleve1.setGrade(1);
		eleve1.setTva(tva);
		eleve1.setPrixPanier(prixPanierEleve);

		Eleve eleve2 = new Eleve();
		eleve2.setGrade(5);
		eleve2.setTva(tva);
		eleve2.setPrixPanier(prixPanierEleve);

		Professeur prof1 = new Professeur();
		prof1.setAnciennete(20);
		prof1.setTva(tva);
		prof1.setPrixPanier(prixPanierProf);

		List<Personne> listePayeur = new ArrayList<>();
		listePayeur.add(eleve1);
		listePayeur.add(eleve2);
		listePayeur.add(prof1);

		double totalPrixPaniers = 0;

		for (int i = 0; i < listePayeur.size(); i++) {
			Personne tempPersonne = listePayeur.get(i);
			totalPrixPaniers = totalPrixPaniers + tempPersonne.calculerPanier();
			System.out.println(tempPersonne + " " + tempPersonne.calculerPanier());

		}
		System.out.println(totalPrixPaniers);

		// Proviseur prov = new Proviseur();
		System.out.println(factoriel(-5));

	}

	// RECUSIVITE
	static int factoriel (int n) {
			if(n < 0) {
				System.out.println("N doit être un nombre entier supérieur à 0");
				return 0;
			}
			
			if(n == 0 || n ==1) {
				return 1;
				
			}else {
				return n * factoriel(n-1);
				}
				
			}
	/*
	5 * factoriel(4);
		4 * factoriel(3);
			3 * factoriel(2);
				2 * factoriel(1);
					1 il connait et va retourner 1
					et on va donc remplacer les factoriels
				2 * factoriel(1) devient 2 * (1)
			3 * factoriel(2); devient 3 * (2 * 1) soit 3* 2
		4 * factoriel(3); devient 4 * (3 * 2 *1) soit 4 * 6
	5 * factoriel(4); devient 5* (4* 3 * 2 *1) soit 5 * 24
					*/
				


}
