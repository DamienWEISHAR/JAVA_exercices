import javax.swing.JFrame;

public class Pokemon {

	
	public static Scene scene;
	
	public static void main(String[] args) {
	
	//création de la fenêtre de jeu
		JFrame fenetre = new JFrame("Pokemon Test");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(800, 600);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		
	//instanciation objet scene
		scene = new Scene();
		
		fenetre.setContentPane(scene);// on associe la scène à la fenetre de l'application
		fenetre.setVisible(true);

	}

}
