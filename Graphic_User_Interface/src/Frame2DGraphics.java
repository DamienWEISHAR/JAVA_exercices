import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Frame2DGraphics extends JFrame {
		
	//Variables
	Panel2DGraphics panel;
	
	
	//constructor
	public Frame2DGraphics() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new Panel2DGraphics();
			
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
	
	
}
