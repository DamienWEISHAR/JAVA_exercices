import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import entites.Personnage;
import tools.Sprite;

@SuppressWarnings("serial")
public class Scene extends JPanel {
	
	private ImageIcon imgIconEthan;	//pour charger l'image
	private Image imgEthan; // pour la dessiner sur la fenêtre
	private Personnage ethan;
	private Personnage trainer;
	
	//CONSTRUCTEUR
	public Scene() {
		
		super(); //fait appel au constructeur de la super classe JPanel
		this.ethan = new Personnage();
		this.ethan.loadImage("/images/ethan.png", 4, 4);
		this.trainer = new Personnage();
		this.trainer.setX(64);
		this.trainer.loadImage("/images/player.png", 4, 4);
	}
	
	//METHODES
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;//changement de graphics (caste) pour une meilleure gestion de la 2D
		this.ethan.draw(g2);
		this.trainer.draw(g2);
	}

}
