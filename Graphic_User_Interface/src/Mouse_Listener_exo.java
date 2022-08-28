import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mouse_Listener_exo extends JFrame implements MouseListener {
	
	//Global
	JLabel label = new JLabel();
	ImageIcon happy;
	ImageIcon hurt;
	ImageIcon dizzy;
	ImageIcon anxious;

	
	//Constructor
	public Mouse_Listener_exo() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
				
		label.addMouseListener(this);
		
		
		//instantiate the image
		happy = new ImageIcon("happiness.png");
		hurt = new ImageIcon("nervous.png");
		dizzy = new ImageIcon("dizzy.png");
		anxious = new ImageIcon ("looking-up.png");
		
		
		label.setIcon(happy);	
		
				
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//Invoked when the mouse button has been clicked (pressed and released) on a component
		System.out.println("you clicked the mouse");
		label.setBackground(Color.red);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// when the mouse button has been pressed on a component
		label.setIcon(hurt);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// when the mouse button has been released on a component
		label.setIcon(dizzy);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// when the mouse enters a component
		label.setIcon(anxious);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// when the mouse exits a component
		label.setIcon(happy);
	}
	
}

