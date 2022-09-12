import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClass extends JFrame{

	/**
	 * 
	 */

	JButton button1; 
	JButton button2;
	JButton button3;
	//constructor
	public AnonymousClass() {
		button1 = new JButton("button 1");
		button2 = new JButton("button 2");
		button3 = new JButton("button 3");
		
		//customize the buttons
		button1.setBounds(100,100,100,100); //(x,y,with,height)
		/*
		 * anonymous class on button 1 and don't need to implements ActionListener
		 * because only need once, specific action on it
		*/
		button1.setBackground(Color.black);
		button1.setForeground(Color.yellow);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("You pressed the button #1 !");
			}
			
		});
		//button2
		button2.setBounds(200,100,100,100);
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("You pressed the button #2 !");
			}
			
		});
		//button3
		button3.setBounds(300,100,100,100);
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("You pressed the button #3 !");
			}
			
		});
		
		
		//add the buttons
		this.add(button1);
		this.add(button2);
		this.add(button3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		
		
	}
	
}
