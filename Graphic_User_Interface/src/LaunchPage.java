import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
	
	JFrame frame = new JFrame("Main Frame");
	JButton myButton = new JButton("New Window");
	
	
	//constructor
	public LaunchPage() {
		
		myButton.setBounds(100,160,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this); //to apply the ActionListener functions on it
		
		
		frame.add(myButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == myButton) { //check if the source is really myButton
			frame.dispose();//close the frame after clicking
			NewWindow myWindow = new NewWindow();
		}
	}
	
	
}
