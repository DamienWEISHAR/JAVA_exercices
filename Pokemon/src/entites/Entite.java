package entites;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import tools.Sprite;

public class Entite {
	//ATTRIBUTS
		private int largeur, hauteur; //dimension du perso
		private int x, y; //position du personnage
		private boolean mouvement; // mouvement du perso
		private Image image;
		private ImageIcon imgIcon;
		private Sprite sprite;
		
		//CONSTRUCTEUR
		public Entite() {
		}
		
		public Entite(int largeur, int hauteur, int x, int y) {
			this.setLargeur(largeur);
			this.setHauteur(hauteur);
			this.setX(x);
			this.setY(y);
		}
		
		
		//METHODES
		public void loadImage(String cheminURL, int maxCaseX, int maxCaseY) {
			this.sprite = new Sprite(cheminURL, maxCaseX, maxCaseY);
			this.image = this.sprite.getSprite(1, 1);
			//BufferedImage b = this.sprite.getSprite(3, 3);
			
			//this.imgIcon = new ImageIcon(getClass().getResource(cheminURL)); //récupérer le chemin d'accès
			//this.image = this.imgIcon.getImage(); // récupération de l'image créée, en objet

		}

		public void draw(Graphics g) {
			g.drawImage(this.image, x,y, null);
		}
		
		//GETTER & SETTER
		public int getLargeur() {
			return largeur;
		}

		public void setLargeur(int largeur) {
			this.largeur = largeur;
		}

		public int getHauteur() {
			return hauteur;
		}

		public void setHauteur(int hauteur) {
			this.hauteur = hauteur;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public boolean isMouvement() {
			return mouvement;
		}

		public void setMouvement(boolean mouvement) {
			this.mouvement = mouvement;
		}
		public Image getImage() {
			return image;
		}
		public void setImage(Image image) {
			this.image = image;
		}
		public ImageIcon getImgIcon() {
			return imgIcon;
		}
		public void setImgIcon(ImageIcon imgIcon) {
			this.imgIcon = imgIcon;
		}
		
		
}
