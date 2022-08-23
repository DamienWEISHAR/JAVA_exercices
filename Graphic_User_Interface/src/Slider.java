import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class Slider implements ChangeListener{

	//Global
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	int min = -50;
	int max = 500;
	int start = 250;
	
	//Constructor
	public Slider() {
		
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(min,max,start);//minimum, maximum,starting point
		
		//customize
		slider.setPreferredSize(new Dimension(400, 250)); //width, height 
		//slider.setBackground(Color.blue);
		slider.setPaintTicks(true);//to get the ticks
		//slider.setMinorTickSpacing(10); //to get the ticks every 10
		slider.setPaintTrack(true); // is true by default, don't need to write it
		slider.setMajorTickSpacing(50);//for the big ticks
		
		//to have the numbers on ticks
		slider.setPaintLabels(true);
		slider.setFont(new Font("ComicSans MS", Font.ITALIC, 15));
		
		//orientation
		slider.setOrientation(SwingConstants.VERTICAL);
		//slider.setOrientation(SwingConstants.HORIZONTAL);
		
		label.setText("Temperature in °C = "+slider.getValue());
		label.setFont(new Font("ComicSans MS", Font.ITALIC, 25));
		
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
	}
	
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		label.setText("Temperature in °C = "+slider.getValue());
		
	}

}
