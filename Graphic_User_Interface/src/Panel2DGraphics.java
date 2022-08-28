import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel2DGraphics extends JPanel{
	
	Image image;
	
	
	Panel2DGraphics(){
		
		
		
		this.setPreferredSize(new Dimension(500,500));
		image = new ImageIcon("paysage.jpg").getImage();
		
	}
	
	@Override
	public void paint(Graphics g) {
		//Graphics2D is a subclass, and Graphics is updated with it so it's better to use
		//Graphics2D has more options available than Graphics so we have to cast!
		
		Graphics2D g2D = (Graphics2D) g;
		//Graphics2D circle = (Graphics2D) g;
		Graphics2D pokeball = (Graphics2D) g;
		Graphics2D triangle = (Graphics2D) g;
		//Graphics2D text = (Graphics2D) g;
		Graphics2D img = (Graphics2D) g;
		Color myColor = Color.decode("#6365ff");
		
		//insert an image, as a background
		img.drawImage(image, 0, 0, null);
		
		
		//draw a line and customize
		//g2D.setStroke(new BasicStroke(10)); //size of the stroke
		//g2D.setPaint(Color.blue); // RGB values or #000000
		//g2D.drawLine(0, 0, 500, 500); // (x1, y1, x2, y2)
		
		//draw a rectangle or a square
		//g2D.setStroke(new BasicStroke(5));
		//g2D.setPaint(myColor); // RGB values or #000000
		//g2D.fillRect(50, 50, 100, 100); // to fill
		//g2D.drawRect(50, 50, 100, 100); // (x, y, width, height)
		
		
		//draw a circle
		//circle.setStroke(new BasicStroke(5));
		//circle.setPaint(Color.yellow); // RGB values or #000000
		//circle.fillOval(50, 50, 100, 100);
		//circle.drawOval(50, 50, 100, 100);
		
		//draw an arc
		//g2D.drawArc(0, 0, 150, 150, 0, 360); //(x, y, width, height, start in degrees, end in degrees)
		
		/*
		//draw a pokeball
		//red top
		pokeball.setStroke(new BasicStroke(5));
		pokeball.setPaint(Color.red);
		pokeball.fillArc(0, 0, 300, 300, 0, 180);
		//white bottom
		pokeball.setStroke(new BasicStroke(5));
		pokeball.setPaint(Color.white);
		pokeball.fillArc(0, 0, 300, 300, 180, 180); // or 0,-180 for the last two numbers
		//middle circle black
		pokeball.setPaint(Color.black);
		pokeball.setStroke(new BasicStroke(5));
		pokeball.drawArc(125, 125, 50, 50, 0, 360);
		//middle circle white
		pokeball.setPaint(Color.white);
		pokeball.fillArc(125, 125, 50, 50, 0, 360);
		//left line
		pokeball.setPaint(Color.black);
		pokeball.setStroke(new BasicStroke(3));
		pokeball.drawLine(2, 150, 122, 150);	
		//right line
		pokeball.setPaint(Color.black);
		pokeball.setStroke(new BasicStroke(3));
		pokeball.drawLine(178, 150, 298, 150);
		//around
		pokeball.drawArc(0, 0, 300, 300, 0, 360);
		
		
		*/
		//draw a triangle
		int[] xPoints = {150,250,350}; // x1, x2, x3
		int[] yPoints = {300,150,300}; // y1, y2, y3
		//triangle.setPaint(Color.cyan);
		//triangle.setStroke(new BasicStroke(3));
		triangle.drawPolygon(xPoints, yPoints, 3); //[]xPoints, []yPoints, number of points (les sommets) 
		//triangle.setPaint(Color.black);
		//triangle.fillPolygon(xPoints, yPoints, 3);
		
		
		/*
		//draw a text
		text.setPaint(Color.gray);
		text.setFont(new Font("Ink Free", Font.BOLD, 50));
		text.drawString("I'm a WINNER baby",50, 50); // ("text", x, y) = the start of the text (bottom left)
		*/
		
		
	}
}
