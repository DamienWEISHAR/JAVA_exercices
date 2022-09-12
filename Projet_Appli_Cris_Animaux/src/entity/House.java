package entity;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class House extends JFrame implements ActionListener {

	//variables
	private JFrame frame;
	private JLabel label;
	private JButton buttonCat;
	private JButton buttonDog;
	private JButton buttonFish;
	private JButton buttonRabbit;
	private JButton buttonBird;
	private JButton buttonBackArrow;
	private ImageIcon fond;
	private ImageIcon cat;
	private ImageIcon dog;
	private ImageIcon fish;
	private ImageIcon rabbit;
	private ImageIcon bird;
	private ImageIcon backArrow;
	private File catFile;
	private Clip catClip;
	
	//constructor
	public House() throws LineUnavailableException, UnsupportedAudioFileException, IOException  {
		
		fond = new ImageIcon("src\\house\\house.jpg");
		
		
		frame = new JFrame("Mes cris d'animaux");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(620,425);
		frame.setLayout(new BorderLayout()); //components by North/South/East/West
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		//create background image
		label = new JLabel(fond);
		
		//----------------------------------------
		//image for the buttonBack
		backArrow = new ImageIcon("src\\img\\backArrow.png");
		//resized image for the button
		Image backArrow1 = backArrow.getImage();
		Image backArrow1modify = backArrow1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		backArrow = new ImageIcon(backArrow1modify);
		//buttonCat
		buttonBackArrow = new JButton(backArrow);
		buttonBackArrow.setBounds(10, 10, 50, 50);	
		buttonBackArrow.addActionListener(this);
		//----------------------------------------
		//image for the buttonCat
		cat = new ImageIcon("src\\house\\cat.png");
		//resized image for the button
		Image cat1 = cat.getImage();
		Image cat1modify = cat1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		cat = new ImageIcon(cat1modify);
		//buttonCat
		buttonCat = new JButton(cat);
		buttonCat.setBounds(120, 250, 75, 75);
		
		//----------------------------------------
		//image for the buttonDog
		dog = new ImageIcon("src\\house\\dog.png");
		//resized image for the button
		Image dog1 = dog.getImage();
		Image dog1modify = dog1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		dog = new ImageIcon(dog1modify);
		//buttonDog
		buttonDog = new JButton(dog);
		buttonDog.setBounds(420, 250, 75, 75);
		//------------------------------------------
		//image for the buttonFish
		fish = new ImageIcon("src\\house\\fish.png");
		//resized image for the button
		Image fish1 = fish.getImage();
		Image fish1modify = fish1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		fish = new ImageIcon(fish1modify);
		//buttonDog
		buttonFish = new JButton(fish);
		buttonFish.setBounds(430, 125, 75, 75);
		//----------------------------------------
		//image for the buttonRabbit
		rabbit = new ImageIcon("src\\house\\rabbit.png");
		//resized image for the button
		Image rabbit1 = rabbit.getImage();
		Image rabbit1modify = rabbit1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		rabbit = new ImageIcon(rabbit1modify);
		//buttonDog
		buttonRabbit = new JButton(rabbit);
		buttonRabbit.setBounds(100, 125, 75, 75);
		
		//----------------------------------------
		//image for the buttonBird
		bird = new ImageIcon("src\\house\\bird.png");
		//resized image for the button
		Image bird1 = bird.getImage();
		Image bird1modify = bird1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		bird = new ImageIcon(bird1modify);
		//buttonDog
		buttonBird = new JButton(bird);
		buttonBird.setBounds(260, 125, 75, 75);
		//------------------------------------------
		
		
		//essai pour le son = raté!
		/*
		//cat meow sound
		catFile = new File ("src\\sound\\cat_meow.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(catFile);
		catClip = AudioSystem.getClip(); //pre-load the music file
		catClip.open(audioStream);
		*/
		/*
		File Clap = new File("src\\sound\\cat_meow.wav");
		PlaySound(Clap);
		PlaySound(Clap);
		PlaySound(Clap);
		PlaySound(Clap);
		*/
		
		frame.add(buttonBackArrow);
		frame.add(buttonCat);
		frame.add(buttonDog);
		frame.add(buttonFish);
		frame.add(buttonRabbit);
		frame.add(buttonBird);
		
		frame.add(label);
		frame.setVisible(true);
		
	}
	
/*
	static void PlaySound(File file) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
			
			Thread.sleep(clip.getMicrosecondLength()/1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	*/
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==buttonBackArrow) {
			frame.dispose();
			new Menu();
		}
	}

}
