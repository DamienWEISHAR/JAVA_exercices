import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{

	//variables
	JFrame frame;
	JTextField textField;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[9];
	JButton addButton, subButton,mulButton, divButton;
	JButton decButton, equButton,delButton, clrButton, negButton;
	JPanel panel;
	
	Font myFont = new Font("Arial",Font.BOLD,20);
	
	double num1=0, num2=0, result=0;
	String operator;
	
	Color cyan = Color.decode("#40E0D0");
	Color red = Color.decode("#DC143C");
	Color pink = Color.decode("#FFB6C1");
	Color yellow = Color.decode("#FFFF00");
	
	//constructor
	public Calculator() {
		
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);
		frame.setResizable(false);
		
		//text field
		textField = new JTextField();
		//no layout, so bounds are needed
		textField.setBounds(50,25,300,50);
		textField.setFont(myFont);
		textField.setEditable(false);
		
		
		//buttons
		addButton = new JButton("+");
		addButton.setBackground(cyan);
		subButton = new JButton("-");
		subButton.setBackground(cyan);
		mulButton = new JButton("x");
		mulButton.setBackground(cyan);
		divButton = new JButton("/");
		divButton.setBackground(cyan);
		decButton = new JButton(".");
		decButton.setBackground(cyan);
		equButton = new JButton("=");
		equButton.setBackground(Color.white);
		
		delButton = new JButton("Delete");
		delButton.setBackground(red);
		clrButton = new JButton("Clear");
		clrButton.setBackground(pink);
		negButton=new JButton("(-)");
		negButton.setBackground(Color.orange);
		
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = negButton;
	
		for(int i = 0; i<9;i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		
		for(int i = 0; i<10;i++) {
			numberButtons[i]=new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		
		negButton.setBounds(50,430,100,50);
		delButton.setBounds(150,430,100,50);
		clrButton.setBounds(250,430,100,50);
		
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,10,10)); // row, cols, margin top/bottom, margin right/left
		//panel.setBackground(Color.GRAY);
		
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(equButton);
		panel.add(divButton);
		
		
		frame.add(textField);
		frame.add(panel);
		frame.add(negButton);
		frame.add(delButton);
		frame.add(clrButton);
		frame.setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<10; i++) {
			if(e.getSource()==numberButtons[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource()==decButton) {
			textField.setText(textField.getText().concat(String.valueOf(".")));
		}
		if(e.getSource()==addButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = "+";
			textField.setText("");
			addButton.setBackground(yellow);
		}
		if(e.getSource()==subButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = "-";
			textField.setText(num1+operator);
			subButton.setBackground(yellow);
		}
		if(e.getSource()==mulButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = "x";
			textField.setText(num1+operator);
			mulButton.setBackground(yellow);
		}
		if(e.getSource()==divButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = "/";
			textField.setText(num1+operator);
			divButton.setBackground(yellow);
		}
		if(e.getSource()==equButton) {
			num2 = Double.parseDouble(textField.getText());
			
			switch(operator) {
			case "+": 
				result = num1+num2;
				addButton.setBackground(cyan);
				break;
			case "-": 
				result = num1-num2;
				subButton.setBackground(cyan);			
				break;
			case "x": 
				
				result = num1*num2;
				mulButton.setBackground(cyan);
				break;
			case "/": 
				result = num1/num2;
				divButton.setBackground(cyan);
				break;
			
			}
			textField.setText(String.valueOf(result));
			num1=result;
		}
		if(e.getSource()==clrButton) {
			textField.setText("");
		}
		if(e.getSource()==delButton) {
			String string = textField.getText(); //put the value in a variable
			textField.setText(""); //set the variable in ""
			for(int i=0;i<string.length()-1;i++) { //loop
				textField.setText(textField.getText()+string.charAt(i));
			}
			
		}
		if(e.getSource()==negButton) {
			double temp = Double.parseDouble(textField.getText());
			temp = temp*(-1);
			textField.setText(String.valueOf(temp));
		}
			

	}
}

