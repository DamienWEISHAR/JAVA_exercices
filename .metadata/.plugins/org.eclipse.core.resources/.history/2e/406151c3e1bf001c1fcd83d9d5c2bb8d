import java.util.List;

import entite.Album;
import entite.Artiste;
import entite.Chanson;

// import entite.*; // Tu peux importer tout le contenu du packager Entite avec cette commande

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artiste avrilLavigne = new Artiste("Lavigne", "Avril", "Avril Lavigne", 38);
		Artiste amyLee = new Artiste("Lee", "Amy", "Amy Lee", 40);
		
		System.out.println(avrilLavigne);
		
		Album letGo = new Album("Let Go");
		System.out.println(letGo.getTitre());
		
		Chanson complicated = new Chanson("Complicated");
		//complicated.setAuteur(amyLee);
		//complicated.setChanteur(avrilLavigne);
		letGo.ajoutChanson(complicated);
		
		Chanson sk8erBoi = new Chanson ("sk8er Boi");
		//sk8erBoi.setAuteur(avrilLavigne);
		//sk8erBoi.setChanteur(avrilLavigne);
		
		sk8erBoi.ajoutAuteur(avrilLavigne);
		sk8erBoi.ajoutChanteur(amyLee);
		sk8erBoi.ajoutChanteur(avrilLavigne);
		
		letGo.ajoutChanson(sk8erBoi);
		
		Chanson sk8erBoiCover = new Chanson ("sk8er Boi Cover by Amy Lee");
		//sk8erBoiCover.setAuteur(sk8erBoi.getAuteur());
		//sk8erBoiCover.setChanteur(amyLee);
		letGo.ajoutChanson(sk8erBoiCover);
		
		List<Chanson> listeDesChansons = letGo.getListeDesTitres();
		
		for(int i = 0; i < listeDesChansons.size(); i++) {
			Chanson laChanson = listeDesChansons.get(i);
			//System.out.println("La chanson n°" + i + " est = " + laChanson +", elle est chantée par "+laChanson.getChanteur() + " et est composée par " + laChanson.getAuteur());
			System.out.println("La chanson n°" + i + " est = " + laChanson +", elle est chantée par "+laChanson.getListeDesChanteurs() + " et est composée par " + laChanson.getListAuteurs());
					
		}
		
		
		/*for(Chanson laChanson: listeDesChansons) {
			int i = listeDesChansons.indexOf(laChanson);
			System.out.println("La chanson n°" + i + " est = " + laChanson);
		}*/
	
	}


}
