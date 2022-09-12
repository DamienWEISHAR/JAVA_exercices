package entity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu implements ActionListener{

	JFrame frame;
	JButton houseButton;
	JButton savaneButton;
	JButton farmButton; 
	
	
	//constructor
	public Menu() {
		
		frame = new JFrame("Mes cris d'animaux");
		
		houseButton = new JButton("A la maison");
		houseButton.setBounds(100,60,200,40);
		houseButton.setFocusable(false);
		houseButton.addActionListener(this); //to apply the ActionListener functions on it
		
		farmButton = new JButton("A la ferme");
		farmButton.setBounds(100,110,200,40);
		farmButton.setFocusable(false);
		farmButton.addActionListener(this); 
		
		savaneButton = new JButton("A la savane");
		savaneButton.setBounds(100,160,200,40);
		savaneButton.setFocusable(false);
		savaneButton.addActionListener(this); 


		frame.add(houseButton);
		frame.add(savaneButton);
		frame.add(farmButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == houseButton) { //check if the source is really myButton
			frame.dispose();//close the frame after clicking
			try {
				House house = new House();
			} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource() == savaneButton) { //check if the source is really myButton
			frame.dispose();//close the frame after clicking
			try {
				Savane savane = new Savane();
			} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource() == farmButton) { //check if the source is really myButton
			frame.dispose();//close the frame after clicking
			try {
				Farm farm = new Farm();
			} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	
}
