import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class StopWatch implements ActionListener {
	
	//variables
	JFrame frame = new JFrame("Stop Watch");
	JButton startButton = new JButton("Start");
	JButton resetButton = new JButton("Reset");
	JLabel timeLabel = new JLabel();
	//in ms
	int elapsedTime = 0; //starting time
	int seconds = 0 ;
	int minutes = 0;
	int hours = 0;
	
	boolean started = false;
	
	String seconds_string = String.format("%02d", seconds); //to have 00
	String minutes_string = String.format("%02d", minutes);
	String hours_string = String.format("%02d", hours);
	
	Timer timer = new Timer(1000, new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			elapsedTime = elapsedTime+1000;
			
			hours = (elapsedTime/3600000);
			minutes = (elapsedTime/60000)%60;
			seconds = (elapsedTime/1000)%60;
			
			seconds_string = String.format("%02d", seconds);
			minutes_string = String.format("%02d", minutes);
			hours_string = String.format("%02d", hours);
			
			timeLabel.setText(hours_string+" : "+minutes_string+" : "+seconds_string);
		}
		
		
	});
	
	//constructor
	public StopWatch() {
		
		timeLabel.setText(hours_string+" : "+minutes_string+" : "+seconds_string);
		timeLabel.setBounds(100, 100, 200, 100);
		timeLabel.setFont(new Font("Arial", Font.BOLD, 35));
		timeLabel.setBorder(BorderFactory.createEtchedBorder(1));
		timeLabel.setOpaque(true);
		timeLabel.setHorizontalAlignment(JTextField.CENTER);
		
		startButton.setBounds(100,200,100,50);
		startButton.setFont(new Font("Arial", Font.BOLD, 20));
		startButton.setFocusable(false);
		startButton.addActionListener(this);
		
		resetButton.setBounds(200,200,100,50);
		resetButton.setFont(new Font("Arial", Font.BOLD, 20));
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(timeLabel);
		frame.add(startButton);
		frame.add(resetButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==startButton) {
			if(started == false) {
				started = true;
				startButton.setText("STOP");
				start();
			}
			else {
				started = false;
				startButton.setText("Start");
				stop();
			}
		}
		if(e.getSource()==resetButton) {
			started = false;
			startButton.setText("Start");
			reset();
		}
		
	}
	public void start() {
		timer.start();
		
	}
	public void stop() {
		timer.stop();

	}
	public void reset() {
		timer.stop();
		
		//back to 0
		elapsedTime = 0; //starting time
		seconds = 0 ;
		minutes = 0;
		hours = 0;
		//updating the variables
		seconds_string = String.format("%02d", seconds);
		minutes_string = String.format("%02d", minutes);
		hours_string = String.format("%02d", hours);
		
		timeLabel.setText(hours_string+" : "+minutes_string+" : "+seconds_string);
	}

}
