//import javax.swing.Icon;
//import javax.swing.ImageIcon;
//import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 
		 * SLIDER
		 * 
		 */
		new Slider();
		
		//-------------------------------------------------------------------------
		
		/*
		 * 
		 * 
		 * COMBOBOX
		 * new ComboBox();
		 */
		
		//-------------------------------------------------------------------------
		/*
		 * 
		 * CHECKBOX multiple
		 * new MyFrameCheckbox();
		 */
		
		
		//-------------------------------------------------------------------------
		
		/*
		 * 
		 * CHECKBOX simple
		 * new MyFrameCheckbox();
		 */
		
		
		
		//-------------------------------------------------------------------------
		
		
		/*
		 * 
		 * TEXTFIELD
		 * 
		 * MyFrame frame = new MyFrame();
		 */
			
		
		//-------------------------------------------------------------------------
		
		
		
		/*
		 * 
		 * JOptionPane = pop up a standard dialog box that prompts users for a value 
		 *    			 or informs them of something.
		 * 
		 */
		/*
		JOptionPane.showMessageDialog(null, "message normal, simple", "title", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "message avec icone d'information", "Information", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "message avec icone de question", "Question", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "message avec icone d'attention", "Attention", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "message avec icone d'erreur", "Erreur", JOptionPane.DEFAULT_OPTION);
		*/	
		
		
		
		//display the window
		//JOptionPane.showConfirmDialog(null, "Ca va?","Titre", JOptionPane.DEFAULT_OPTION);
		
		//display the window and print the answer in the console, Yes returns 0, No = 1, Cancel = 2, Exit = -1
		//System.out.println(JOptionPane.showConfirmDialog(null, "Ca va?","Titre", JOptionPane.YES_NO_CANCEL_OPTION));
		//you can save the return in a variable
		/*
		int answer = JOptionPane.showConfirmDialog(null, "Ca va?","Titre", JOptionPane.YES_NO_CANCEL_OPTION);
		switch(answer) {
		
			case (0): 
				System.out.println("I am OK");
			break;
			case (1): 
				System.out.println("I feel bad...");
			break;
			case (2): 
				System.out.println("Just canceled");
			break;
			case (-1): 
				System.out.println("Click on Exit");
			break;
			//IDEA ===> I can make newWindow with the LaunchPage, instead of just print on console
		}
		
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println(name);
		
		
		
		String[] responses = {"OUI", "NON", "CHEH"};
		
		ImageIcon icon = new ImageIcon("chaton.png");
		
		JOptionPane.showOptionDialog(null, "MESSAGE", "title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses ,2);
		
		*/
		
		//-------------------------------------------------------------------------
		
		/*
		LaunchPage launchPage = new LaunchPage();
		*/
		
		
	}

}
