import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox extends JFrame implements ActionListener {

	
	//Global variables
	
	String[] options = {"dog","cat","fish"};
	Integer[] numbers = {1,2,3};
	JComboBox combo;
	JComboBox combo2;
	
	//constructor
	public ComboBox() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		//to center the frame
		this.setLocationRelativeTo(null);
		
		combo = new JComboBox(options);
		combo.addActionListener(this);
		
		combo2 = new JComboBox(numbers);
		combo2.addActionListener(this);
		
		//customize
		//combo.setEditable(true);
		//System.out.println(combo.getItemCount());
		//combo.addItem("horse");//=> to add an item at the end of the list
		//combo.insertItemAt("pig", 0);
		//combo.setSelectedIndex(0); //=> to have a selected item at start
		//combo.removeItem("fish");
		//combo.removeItemAt(2);
		//combo.removeAllItems();
		
		this.add(combo);
		this.add(combo2);
		this.pack();
		this.setVisible(true);
	}
	
	
	// NEED TO ADD A BUTTON TO VALIDATE THE CHOICES TO MAKE IT WORK WITH 2 COMBOBOXES
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==combo && e.getSource()==combo2) {
			System.out.println(combo.getSelectedItem()+ " = index numero "+ combo2.getSelectedItem()); 
		}
	}

}
