import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JFrame implements ActionListener {

	
	//Global Variables
	//to create the menu bar
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("HELP");
		
		//to create the item for the menu bar
		JMenuItem loadItem = new JMenuItem("Load");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem exitItem = new JMenuItem("EXIT");
		
		//images
		ImageIcon loadIcon = new ImageIcon("dossier.png");
		ImageIcon saveIcon = new ImageIcon("sauvegarder.png");
		ImageIcon exitIcon = new ImageIcon("exit.png");
	
	//Constructor
	public MenuBar() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);//to center the frame
		
				
		//to add the ActionListener on the items on the click
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		//add icon
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		
		//to add shortcuts by key 
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for file
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for file
		
		loadItem.setMnemonic(KeyEvent.VK_L); //press l to load 
		saveItem.setMnemonic(KeyEvent.VK_S); //press s to load 
		exitItem.setMnemonic(KeyEvent.VK_E); //press e to load 
		
		
		//to add into a menu (list)
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		//to add the menu bar
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);//to add the menu bar
		
		this.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==loadItem) {
			System.out.println("you are loading a file");
		}if(e.getSource()==saveItem) {
			System.out.println("SAVE");
		}if(e.getSource()==exitItem) {
			System.exit(0); //to exit by clicking on exit
		}
	}

}
