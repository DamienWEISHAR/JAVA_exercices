import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileChooser extends JFrame implements ActionListener {

	//Global
	JButton button = new JButton("Click");
	
	//Constructor
	public FileChooser() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		//to center
		this.setLocationRelativeTo(null);
		
		//add the Action Listener
		button.addActionListener(this);
		
		this.add(button);
		this.pack();
		this.setVisible(true);
		
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			
			JFileChooser fileChooser = new JFileChooser();
			//set the current directory
			fileChooser.setCurrentDirectory(new File("."));
			//select file to open
			int response = fileChooser.showOpenDialog(null);
			//int response = fileChooser.showSaveDialog(null);
			
			if (response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
			
			
		}
	}

}
