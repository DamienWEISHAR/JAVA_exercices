import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyFrame extends JFrame{
	
	//variables
	Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	int width = 350;
	int height = 65;
	
	
	//constructor
	public MyFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock (1st project)");
		this.setLayout(new FlowLayout()); //ligne par ligne
		this.setSize(350,250);
		this.setResizable(false);
		this.setBackground(Color.white);
		
		timeFormat = new SimpleDateFormat("HH:mm:ss");
		timeLabel = new JLabel();
		timeLabel.setPreferredSize(new Dimension(width,height));
		timeLabel.setFont(new Font("Arial", Font.BOLD, 50));
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel.setBackground(new Color(0x00008B)); //0x = # on #00008B
		timeLabel.setForeground(Color.white);
		timeLabel.setOpaque(true);
		
		
		dayFormat = new SimpleDateFormat("EEEE");
		dayLabel = new JLabel();
		dayLabel.setPreferredSize(new Dimension(width,height));
		dayLabel.setFont(new Font("Arial", Font.BOLD, 50));
		dayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dayLabel.setBackground(Color.white); 
		dayLabel.setForeground(new Color(0x00008B));
		dayLabel.setOpaque(true);
		
		dateFormat = new SimpleDateFormat("d/M/y");
		dateLabel = new JLabel();
		dateLabel.setPreferredSize(new Dimension(width,height));
		dateLabel.setFont(new Font("Arial", Font.BOLD, 50));
		dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dateLabel.setBackground(Color.white); 
		dateLabel.setForeground(new Color(0x00008B));
		dateLabel.setOpaque(true);
		
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		//this.pack();
		this.setVisible(true);
		
		
		setTime();
	}

	public void setTime() {
		while(true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);
			
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			
			
			//update every second
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
