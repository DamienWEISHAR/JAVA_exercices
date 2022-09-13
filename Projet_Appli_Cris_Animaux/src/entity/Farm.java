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

public class Farm extends JFrame implements ActionListener {

	//variables
	private JFrame frame;
	private JLabel label;
	private JButton buttonChicken;
	private JButton buttonCow;
	private JButton buttonPig;
	private JButton buttonDuck;
	private JButton buttonHorse;

	private JButton buttonBackArrow;
	private ImageIcon fond;
	private ImageIcon chicken;
	private ImageIcon cow;
	private ImageIcon pig;
	private ImageIcon duck;
	private ImageIcon horse;
	
	private ImageIcon backArrow;
	
	
	//constructor
	public Farm() throws LineUnavailableException, UnsupportedAudioFileException, IOException  {
		
		fond = new ImageIcon("src\\farm\\farm.jpg");
		
		
		frame = new JFrame("Mes cris d'animaux");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(577,400);
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
		
		//image for the buttonChicken
		chicken = new ImageIcon("src\\farm\\chicken.png");
		//resized image for the button
		Image chicken1 = chicken.getImage();
		Image chicken1modify = chicken1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		chicken = new ImageIcon(chicken1modify);
		//buttonCrocodile
		buttonChicken = new JButton(chicken);
		buttonChicken.setBounds(230, 150, 75, 75);
		buttonChicken.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playSound("src\\sound\\chicken.wav");
			}
			
		});
		//----------------------------------------
		//image for the buttonCow
		cow = new ImageIcon("src\\farm\\cow.png");
		//resized image for the button
		Image cow1 = cow.getImage();
		Image cow1modify = cow1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		cow = new ImageIcon(cow1modify);
		//buttonCow
		buttonCow = new JButton(cow);
		buttonCow.setBounds(430, 105, 75, 75);
		buttonCow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playSound("src\\sound\\cow.wav");
			}
			
		});

		//------------------------------------------
		
		//image for the buttonPig
		pig = new ImageIcon("src\\farm\\pig.png");
		//resized image for the button
		Image pig1 = pig.getImage();
		Image pig1modify = pig1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		pig = new ImageIcon(pig1modify);
		//buttonPig
		buttonPig = new JButton(pig);
		buttonPig.setBounds(460, 250, 75, 75);
		buttonPig.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playSound("src\\sound\\pig.wav");
			}
			
		});
		//----------------------------------------
		
		//image for the buttonDuck
		duck = new ImageIcon("src\\farm\\duck.png");
		//resized image for the button
		Image duck1 = duck.getImage();
		Image duck1modify = duck1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		duck = new ImageIcon(duck1modify);
		//buttonDuck
		buttonDuck = new JButton(duck);
		buttonDuck.setBounds(260, 275, 75, 75);
		buttonDuck.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playSound("src\\sound\\duck.wav");
			}
			
		});
		//----------------------------------------

		//image for the buttonHorse
		horse = new ImageIcon("src\\farm\\horse.png");
		//resized image for the button
		Image horse1 = horse.getImage();
		Image horse1modify = horse1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		horse = new ImageIcon(horse1modify);
		//buttonHorse
		buttonHorse = new JButton(horse);
		buttonHorse.setBounds(80, 210, 75, 75);
		buttonHorse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playSound("src\\sound\\horse.wav");
			}
			
		});

		
		frame.add(buttonBackArrow);
		frame.add(buttonChicken);
		frame.add(buttonCow);
		frame.add(buttonPig);
		frame.add(buttonDuck);
		frame.add(buttonHorse);
		;
		
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
