import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColorChooser extends JFrame implements ActionListener{

	//Global
	JButton button = new JButton("Text Color");
	JButton button2 = new JButton("Background Color");
	JLabel label = new JLabel();
	
	//Constructor
	public ColorChooser() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		
		//add ActionListener on the button
		button.addActionListener(this);
		button2.addActionListener(this);
		
		//set and customize the label
		label.setBackground(Color.BLACK);
		label.setText("Choose a color");
		label.setForeground(Color.GREEN);
		label.setOpaque(true);
		label.setFont(new Font("MV Boli", Font.BOLD, 80));
		
		this.add(button);
		this.add(button2);
		this.add(label);
		this.pack();
		this.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==button) {
			//to create the color chooser
			JColorChooser colorChooser = new JColorChooser();
			
			//to display the color chooser
			Color color = JColorChooser.showDialog(null, "TITRE DE LA PALETTE", Color.black);
			
			//to use the color chooser
			label.setForeground(color);
			//label.setBackground(color);
			
		}
		else if (e.getSource()==button2) {
			//to create the color chooser
			JColorChooser colorChooser2 = new JColorChooser();
			
			//to display the color chooser
			Color color2 = JColorChooser.showDialog(null, "TITRE DE LA PALETTE", Color.black);
			
			//to use the color chooser
			label.setBackground(color2);
		}
		
	}

}
