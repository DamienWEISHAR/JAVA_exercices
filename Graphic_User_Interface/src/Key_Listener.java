import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Key_Listener extends JFrame implements KeyListener {

	//Global
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	ImageIcon image = new ImageIcon("poisson.png");
	
	
	
	public Key_Listener() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		//add a label and customize
		label.setBounds(0,0,32,32);
		//label2.setBounds(0,0,50,50);
		
		//to create a rectangle
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		//label2.setBackground(Color.BLACK);
		//label2.setOpaque(true);
		//to add an icon on the label
		//label.setIcon(image);
		//to change the color of the label background
		this.getContentPane().setBackground(Color.BLUE);
		
			
				
		this.add(label);
		//this.add(label2);
		this.setVisible(true);
		
	}
	
	//PS: label2 doesn't work like label, and i don't know why I can't move it the same way
	//it feels like it is stuck 
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//keyTyped = Invoked when a key is typed. Uses KeyChar, char output
		
		switch(e.getKeyChar()) {
			case 'q': label2.setLocation(label.getX()-10, label.getY());// left
				break;
			case 'z': label2.setLocation(label.getX(), label.getY()-10);// up
				break;
			case 's': label2.setLocation(label.getX(), label.getY()+10); // down
				break;
			case 'd': label2.setLocation(label.getX()+10, label.getY()); //right
				break;
		}
		
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
		switch(e.getKeyCode()) {
			case 37: label.setLocation(label.getX()-10, label.getY()); // left arrow
				break;
			case 38: label.setLocation(label.getX(), label.getY()-10); // up arrow
				break;
			case 39: label.setLocation(label.getX()+10, label.getY()); //right arrow
				break;
			case 40: label.setLocation(label.getX(), label.getY()+10); // down arrow
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//keyReleased = called whenever a button is released
		System.out.println("You released key char: " + e.getKeyChar());
		System.out.println("You released key code: " + e.getKeyCode());
	}

}
