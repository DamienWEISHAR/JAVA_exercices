import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mouse_Listener extends JFrame implements MouseListener {
	
	//Global
	JLabel label = new JLabel();
		
	//Constructor
	public Mouse_Listener() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
				
		
		label.setBounds(200,200,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		label.addMouseListener(this);
		
		
		this.add(label);
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
		System.out.println("you pressed the mouse");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// when the mouse button has been released on a component
		
		System.out.println("you released the componant");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// when the mouse enters a component
		label.setBackground(Color.black);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// when the mouse exits a component
		label.setBackground(Color.blue);
	}
	
}
