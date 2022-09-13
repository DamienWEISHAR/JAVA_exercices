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
import javax.swing.JOptionPane;

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
	
	
	//constructor
	public House() throws LineUnavailableException, UnsupportedAudioFileException, IOException  {
		
		fond = new ImageIcon("src\\house\\house.jpg");
		
		
		frame = new JFrame("Mes cris d'animaux");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(620,425);
		frame.setLayout(new BorderLayout()); //components by North/South/East/West
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		
		label = new JLabel(fond);
		
		//----------------------------------------
		
		backArrow = new ImageIcon("src\\img\\backArrow.png");
		
		Image backArrow1 = backArrow.getImage();
		Image backArrow1modify = backArrow1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		backArrow = new ImageIcon(backArrow1modify);
	
		buttonBackArrow = new JButton(backArrow);
		buttonBackArrow.setBounds(10, 10, 50, 50);	
		buttonBackArrow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playSound("src\\sound\\back.wav");
				if(e.getSource()==buttonBackArrow) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					frame.dispose();
					new Menu();
				}
			}
			
		});
		
		//----------------------------------------
	
		cat = new ImageIcon("src\\house\\cat.png");
		
		Image cat1 = cat.getImage();
		Image cat1modify = cat1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		cat = new ImageIcon(cat1modify);
	
		buttonCat = new JButton(cat);
		buttonCat.setBounds(120, 250, 75, 75);
		buttonCat.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playSound("src\\sound\\cat.wav");
			}
			
		});
		//----------------------------------------
		
		dog = new ImageIcon("src\\house\\dog.png");
		
		Image dog1 = dog.getImage();
		Image dog1modify = dog1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		dog = new ImageIcon(dog1modify);
		
		buttonDog = new JButton(dog);
		buttonDog.setBounds(420, 250, 75, 75);
		buttonDog.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playSound("src\\sound\\dog.wav");
				
			}
			
		});
		//------------------------------------------
		
		fish = new ImageIcon("src\\house\\fish.png");
		
		Image fish1 = fish.getImage();
		Image fish1modify = fish1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		fish = new ImageIcon(fish1modify);
		
		buttonFish = new JButton(fish);
		buttonFish.setBounds(430, 125, 75, 75);
		
		//====> sound missing!
		
		
		//----------------------------------------
		
		rabbit = new ImageIcon("src\\house\\rabbit.png");
		
		Image rabbit1 = rabbit.getImage();
		Image rabbit1modify = rabbit1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		rabbit = new ImageIcon(rabbit1modify);
		
		buttonRabbit = new JButton(rabbit);
		buttonRabbit.setBounds(100, 125, 75, 75);
		buttonRabbit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playSound("src\\sound\\rabbit.wav");
			}
		});
		
		//----------------------------------------
		
		bird = new ImageIcon("src\\house\\bird.png");
		//resized image for the button
		Image bird1 = bird.getImage();
		Image bird1modify = bird1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		bird = new ImageIcon(bird1modify);
		
		buttonBird = new JButton(bird);
		buttonBird.setBounds(260, 125, 75, 75);
		buttonBird.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playSound("src\\sound\\bird.wav");
			}
		});
		//------------------------------------------
		
		
		
		frame.add(buttonBackArrow);
		frame.add(buttonCat);
		frame.add(buttonDog);
		frame.add(buttonFish);
		frame.add(buttonRabbit);
		frame.add(buttonBird);
		
		frame.add(label);
		frame.setVisible(true);
		
	}

	
	public void playSound(String sound) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sound).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			
		} catch (Exception e) {
			System.out.println("Error with playing sound");
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
