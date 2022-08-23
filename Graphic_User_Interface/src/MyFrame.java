import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener  {
	
	//GLOBAL Variables
	JButton button;
	JTextField textField;
	
	//Constructor
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension (250,50));
		//customize
		textField.setBackground(Color.cyan);
		textField.setForeground(Color.black);
		textField.setFont(new Font("Times New Roman",Font.BOLD, 25 ));
		textField.setText("Enter your name");
		textField.setEditable(false); //i can't edit the text anymore!
		
		
		button = new JButton("Click me");
		button.addActionListener(this);
		
		
		this.add(button);
		this.add(textField);
		
		
		this.pack(); //to adjust and fit the components
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//to check if the action is on the button
		if(e.getSource()== button) {
			String input = textField.getText();
			button.setEnabled(false); //can't click on again after first try
			System.out.println(input);
		}
		
	}

	
}
