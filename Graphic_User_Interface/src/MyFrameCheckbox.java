import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;
public class MyFrameCheckbox extends JFrame implements ActionListener{

	
	JRadioButton catButton = new JRadioButton("chat");
	JRadioButton dogButton = new JRadioButton("chien");
	JRadioButton fishButton = new JRadioButton("poisson");
	
	ImageIcon catIcon = new ImageIcon("chat-noir.png");
	ImageIcon dogIcon = new ImageIcon("chien.png");
	ImageIcon fishIcon = new ImageIcon("poisson.png");
	
	
	//Constructor
	public MyFrameCheckbox() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
	
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(catButton);
		group.add(dogButton);
		group.add(fishButton);
		
		catButton.addActionListener(this);
		dogButton.addActionListener(this);
		fishButton.addActionListener(this);	
		
		catButton.setIcon(catIcon);
		dogButton.setIcon(dogIcon);
		fishButton.setIcon(fishIcon);
		
		this.add(catButton);
		this.add(dogButton);
		this.add(fishButton);
		
		this.pack();
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==catButton) {
			System.out.println("It is a cat!");
		}
		if (e.getSource()==dogButton){
			System.out.println("It is a dog!");
		}
		else if (e.getSource()==fishButton){
			System.out.println("It is a fish!");
		}
	}
	
}	
	
	
	
	

	
	

		
	//----------------------------------------------------------------------------
	/*
	 * 
	 * Simple CheckBox
	 * 
	 * 
	 * 
	//Global Variables
	JButton button = new JButton("CLICK HERE");
	JCheckBox checkBox = new JCheckBox("Not a robot!");
	ImageIcon chaton = new ImageIcon("chaton.png");
	ImageIcon chat = new ImageIcon("chat.png");
	
	//Constructor
	public MyFrameCheckbox() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		//button = new JButton();
		//button.setText("Click me");
		button.addActionListener(this);
		
		//checkBox = new JCheckBox();
		//checkBox.setText("Je ne suis pas un robot");
		checkBox.setFocusable(false);//to remove the border of the text
		checkBox.setFont(new Font("Comic Sans MS", Font.ITALIC, 35));
		checkBox.setIcon(chaton);
		checkBox.setSelectedIcon(chat);
	
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected()); 
		}
		
	}
	*/

