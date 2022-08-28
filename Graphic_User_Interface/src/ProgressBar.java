import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar {

	JFrame frame = new JFrame("Progress Bar Demo");
	JProgressBar bar = new JProgressBar();
	
	
	//constructor
	public ProgressBar() {
		
		//bar
		bar.setValue(0); //the start
		bar.setBounds(0,0,420,50); // bar size
		bar.setStringPainted(true); //display the %
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		//backwards
		//bar.setForeground(Color.red);
		//bar.setBackground(Color.black);
		
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		//call the method fill()
		fill();
	}
	
	public void fill() {
		int counter = 0 ;
		//int hp = 500;
		
		while (counter<=100) { //hp>0
			bar.setValue(counter);//(hp)
			//bar.setString(hp+"/500 HP");
			try {
				Thread.sleep(50);//pause each 1000 ms (=1s)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter +=10; //increase +10 each time
			//counter -=10;
		}
		bar.setString("Done!!"); // display the text instead of the % when it's complete.
	}
}
