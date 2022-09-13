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

	
	//constructor
	public Savane() throws LineUnavailableException, UnsupportedAudioFileException, IOException  {
		
		fond = new ImageIcon("src\\savane\\savane.jpg");
		
		
		frame = new JFrame("Mes cris d'animaux");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(626,348);
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
						e1.printStackTrace();
					}
					frame.dispose();
					new Menu();
				}
			}
			
		});
		//----------------------------------------
		
	
		crocodile = new ImageIcon("src\\savane\\crocodile.png");
		
		Image crocodile1 = crocodile.getImage();
		Image crocodile1modify = crocodile1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		crocodile = new ImageIcon(crocodile1modify);
		
		buttonCrocodile = new JButton(crocodile);
		buttonCrocodile.setBounds(220, 185, 75, 75);
		buttonCrocodile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playSound("src\\sound\\crocodile.wav");
			}
			
		});
		//----------------------------------------
		
		lion = new ImageIcon("src\\savane\\lion.png");
		
		Image lion1 = lion.getImage();
		Image lion1modify = lion1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		lion = new ImageIcon(lion1modify);
		
		buttonLion = new JButton(lion);
		buttonLion.setBounds(460, 230, 75, 75);
		buttonLion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playSound("src\\sound\\lion.wav");
			}
			
		});
		//------------------------------------------
		
		
		elephant = new ImageIcon("src\\savane\\elephant.png");
		
		Image elephant1 = elephant.getImage();
		Image elephant1modify = elephant1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		elephant = new ImageIcon(elephant1modify);
		
		buttonElephant = new JButton(elephant);
		buttonElephant.setBounds(430, 105, 75, 75);
		buttonElephant.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playSound("src\\sound\\elephant.wav");
			}
			
		});
		//----------------------------------------
		
		
		monkey = new ImageIcon("src\\savane\\monkey.png");
		
		Image monkey1 = monkey.getImage();
		Image monkey1modify = monkey1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		monkey = new ImageIcon(monkey1modify);
		
		buttonMonkey = new JButton(monkey);
		buttonMonkey.setBounds(100, 75, 75, 75);
		buttonMonkey.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playSound("src\\sound\\monkey.wav");
			}
			
		});
		
		
		frame.add(buttonBackArrow);
		frame.add(buttonCrocodile);
		frame.add(buttonLion);
		frame.add(buttonElephant);
		frame.add(buttonMonkey);
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
