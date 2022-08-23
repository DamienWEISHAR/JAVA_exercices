import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MyFrame extends JFrame implements ActionListener{

	
	JButton button;

	//CONSTRUCTOR
	public MyFrame(){
		
		ImageIcon cat = new ImageIcon("chat.png");
		
		button = new JButton();
		button.setBounds(150,200, 250,150);//size and place of the button
		button.addActionListener(this);
		//OR
		//button.addActionListener(e -> System.out.println("HELLO")); //if used, don't need the Override, it's called a lambda expression
		button.setText("Button");
		button.setFocusable(false);
		button.setIcon(cat);
		//button.setHorizontalTextPosition(JButton.CENTER);
		//button.setVerticalTextPosition(JButton.TOP);
		button.setForeground(Color.RED); //change the color of the text label
		button.setBackground(Color.blue); //change the color of the button background
		button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 25));
		
		this.setVisible(true); //make frame visible
		this.setSize(550, 550); //set the size of the frame (width, height)
		//this.setResizable(false); //allow resize or not
		this.setTitle("Title is here"); //title of the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of the application
		this.setLayout(null);
		
		
		ImageIcon image = new ImageIcon("mushroom.png"); //create an ImageIcon
		this.setIconImage(image.getImage()); //change icon of frame
		//this.getContentPane().setBackground(Color.cyan);//change the color of background
		//this.getContentPane().setBackground(new Color(0,123,123)); //RGB or Hex (with 0xF8C471 for example)
		
		this.add(button);//add the button
	}
	
	//when i add "implements ActionListener", i have to "add unimplemented methods" on MyFrame
	
	 @Override
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== button) { //to check if it's a button
			System.out.println("HELLO");
		}	
	 }
}

	
	
		


