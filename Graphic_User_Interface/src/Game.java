import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class Game{
	
	//Variables
	JFrame frame;
	JLabel label;
	
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;
	
	
	//Constructor
	public Game(){
		
		frame = new JFrame ("Key Binding Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		
		//instantiate the label
		label = new JLabel();
		label.setBackground(Color.red);
		label.setBounds(100,100,100,100);
		label.setOpaque(true);
		
		
		//instantiate the Action
		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
		
		//each swing component can have their own mapping of key events to actions
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction" ); //what stroke for what action
		label.getActionMap().put("upAction", upAction); // put (key, action) the key is the name before of the action, and action is the method
	
		
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction" );
		label.getActionMap().put("downAction", downAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction" );
		label.getActionMap().put("leftAction", leftAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction" );
		label.getActionMap().put("rightAction", rightAction);
		
		
		
		frame.add(label);
		frame.setVisible(true);
	}
		
	//I have to create a specific class for each action
	
	//UP action
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(), label.getY()-10);
		}
		
	}
	
	//DOWN action
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(), label.getY()+10);
		}
		
	}
	
	//LEFT action
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX()-10, label.getY());
		}
		
	}
	
	//RIGHT action
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX()+10, label.getY());
		}
		
	}
}
