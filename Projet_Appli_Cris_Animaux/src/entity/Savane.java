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

public class Savane extends JFrame implements ActionListener {

	//variables
	private JFrame frame;
	private JLabel label;
	private JButton buttonCrocodile;
	private JButton buttonLion;
	private JButton buttonElephant;
	private JButton buttonMonkey;

	private JButton buttonBackArrow;
	private ImageIcon fond;
	private ImageIcon crocodile;
	private ImageIcon lion;
	private ImageIcon elephant;
	private ImageIcon monkey;
	
	private ImageIcon backArrow;
	//private File catFile;
	//private Clip catClip;
	
	//constructor
	public Savane() throws LineUnavailableException, UnsupportedAudioFileException, IOException  {
		
		fond = new ImageIcon("src\\savane\\savane.jpg");
		
		
		frame = new JFrame("Mes cris d'animaux");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(626,348);
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
		
		//image for the buttonCrocodile
		crocodile = new ImageIcon("src\\savane\\crocodile.png");
		//resized image for the button
		Image crocodile1 = crocodile.getImage();
		Image crocodile1modify = crocodile1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		crocodile = new ImageIcon(crocodile1modify);
		//buttonCrocodile
		buttonCrocodile = new JButton(crocodile);
		buttonCrocodile.setBounds(220, 185, 75, 75);
		buttonCrocodile.addActionListener(this);
		//----------------------------------------
		//image for the buttonLion
		lion = new ImageIcon("src\\savane\\lion.png");
		//resized image for the button
		Image lion1 = lion.getImage();
		Image lion1modify = lion1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		lion = new ImageIcon(lion1modify);
		//buttonLion
		buttonLion = new JButton(lion);
		buttonLion.setBounds(460, 230, 75, 75);
		
		//------------------------------------------
		
		//image for the buttonElephant
		elephant = new ImageIcon("src\\savane\\elephant.png");
		//resized image for the button
		Image elephant1 = elephant.getImage();
		Image elephant1modify = elephant1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		elephant = new ImageIcon(elephant1modify);
		//buttonElephant
		buttonElephant = new JButton(elephant);
		buttonElephant.setBounds(430, 105, 75, 75);
		
		//----------------------------------------
		
		//image for the buttonRabbit
		monkey = new ImageIcon("src\\savane\\monkey.png");
		//resized image for the button
		Image monkey1 = monkey.getImage();
		Image monkey1modify = monkey1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		monkey = new ImageIcon(monkey1modify);
		//buttonDog
		buttonMonkey = new JButton(monkey);
		buttonMonkey.setBounds(100, 75, 75, 75);
		
		
		
		
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
		frame.add(buttonCrocodile);
		frame.add(buttonLion);
		frame.add(buttonElephant);
		frame.add(buttonMonkey);
		;
		
		frame.add(label);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==buttonBackArrow) {
			frame.dispose();
			new Menu();
		
		}
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==buttonCat) {
			catClip.start();
		}
	}
*/
}
