
import entite.Moto;
import entite.Navigant;
import entite.Parking;
import entite.Voiture;
import entite.Volant;


public class Main {

	public static void main(String[] args) {
		Voiture voiture = new Voiture(4);	
		voiture.setNom("Clio");
		voiture.setMarque("Renault");
		voiture.setTypeDeCarburant("diesel");
		voiture.setVitesseMax(250);
		//System.out.println(voiture);
		//----------------------------------------------
		Moto moto = new Moto(2);
		moto.setMarque("MBK");
		moto.setTypeDeCarburant("essence");
		moto.setNom("Booster");
		moto.setVitesseMax(180);		
		//System.out.println(moto);
		//----------------------------------------------
		Volant avion = new Volant("avion");
		avion.setNom("Boeing 777");
		avion.setMarque("Airbus");
		System.out.println(avion);
		//----------------------------------------------
		Navigant bateau = new Navigant("bateau");
		bateau.setMarque("Zodiac");
		bateau.setNom("N-ZO");
		System.out.println(bateau);
		//----------------------------------------------
		Parking parking = new Parking("parking pour Roulant");
		System.out.println(parking.getNom());
		parking.ajoutRoulant(moto);
		parking.ajoutRoulant(voiture);
		// parking.ajoutRoulant(bateau); => ne marche pas car bateau n'est pas un Roulant
		
		System.out.println(parking.getListeRoulantAutorise ());
		
		
		
		}
	

}
