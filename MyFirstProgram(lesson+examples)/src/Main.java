//import java.io.File;

//import java.awt.Color;
//import java.awt.Font;

//import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
//import java.awt.Component;

//import java.awt.FlowLayout;

//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.GridLayout;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JLayeredPane;
//import javax.swing.JLabel;
//import javax.swing.JPanel;

//import javax.swing.SwingConstants;

//import javax.swing.border.Border;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;


//import javax.sound.sampled.*;

//import java.util.*;
//import java.util.ArrayList;
//import java.util.Scanner;
//import javax.swing.JOptionPane;
//import java.util.Random;


public class Main {

	public static void main(String[] args)  {
		
		
		
		
		
		//------------------------------------------------------------------------------------------
		
		/*
		 * 
		 *  LAYEREDPANE 
		 * 
		 
		 
		
		 // JLayeredPane = Swing container that provides a 
		 //				third dimension for positioning components
		 //				ex. depth or Z-index    
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);//to make it visible
		label1.setBackground(Color.RED);
		label1.setBounds(50, 50, 200, 200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);//to make it visible
		label2.setBackground(Color.GREEN);
		label2.setBounds(100, 100, 200, 200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);//to make it visible
		label3.setBackground(Color.BLUE);
		label3.setBounds(150, 150, 200, 200);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500); // same size as frame to take all the space needed
		
		layeredPane.add(label1, Integer.valueOf(1)); // they overlap, label1 over label2 over label3, top then underneath then underneath
		layeredPane.add(label2, Integer.valueOf(2));// higher the number is, over the other is the layer
		layeredPane.add(label3, Integer.valueOf(3));
		
		//to change the rank of each
		//layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER); // see java jlayered on google to know the different layers
		//layeredPane.add(label1, Integer(1)); //to be the first, on top, 2 is for underneath etc...
		
		
		JFrame frame = new JFrame("JLayeredPane");
		
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		
		frame.add(layeredPane);
		
		
		
		frame.setVisible(true);
		*/
		
		
		
		//------------------------------------------------------------------------------------------
		
		
		/*
		 * 
		 * GRID LAYOUT
		 * 
		 
		
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new GridLayout(3,3,10,15)); //rows, columns, margin horizontal,margin vertical 

		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		frame.add(new JButton("essai"));
		frame.setVisible(true);
		
		*/
		
		
		//------------------------------------------------------------------------------------------
		
		
		
		
		// Layout Manager = Defines the natural layout for components within a container
		
		// FlowLayout = 	places components in a row, sized at their preferred size. 
		//					If the horizontal space in the container is too small,
		//					the FlowLayout class uses the next available row.
		
		
		
		/*
		 * 1 = create the frame
		 * 2 = create the panel
		 * 3 = add the JButton to the panel
		 * 4 = add the panel to the frame
		 * 5 = set the visibility on true for the frame	  
		 */
		/*
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10)); //to center, and put margins on
		//frame.setLayout(new FlowLayout(FlowLayout.TRAILING)); //sticked to the right
		//frame.setLayout(new FlowLayout(FlowLayout.LEADING)); //sticked to the left
	
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension (400,250)); // set the size of the panel container
		panel.setBackground(Color.red);
		panel.setLayout(new FlowLayout());
		
		panel.add(new JButton("1")); //shortcut to create, instead of making a new object before and use it
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		panel.add(new JButton("0"));
		
		frame.add(panel);
		
		frame.setVisible(true); //at the end, so the visibility is not delayed
		*/
		//------------------------------------------------------------------------------------------
		/*
		 * 
		 * BORDER LAYOUT
		 * 
		 
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		
		frame.setLayout(new BorderLayout(5,5)); //put margins (right/left, top/bottom)
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.white);
		
		panel1.setPreferredSize(new Dimension(100,50));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		//---------------------sub panels-------------------------------
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.darkGray);
		panel8.setBackground(Color.gray);
		panel9.setBackground(Color.lightGray);
		panel10.setBackground(Color.white);
		
		//as I put new panels on panel5, it acts like a container, so I need to setLayout on it
		panel5.setLayout(new BorderLayout(5,5));
		
		panel6.setPreferredSize(new Dimension(50,50));
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
		
		JButton button = new JButton();
		button.setBounds(0,0,10,10);
		button.setBackground(Color.BLUE);
		button.setFocusable(false);
		button.setHorizontalAlignment(JButton.RIGHT);
		//button.setVerticalAlignment(JButton.CENTER);
		
		
		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.SOUTH);
		panel5.add(panel8, BorderLayout.WEST);
		panel5.add(panel9, BorderLayout.EAST);
		panel5.add(panel10, BorderLayout.CENTER);
		//panel5.add(button);
		
		
		//---------------------sub panels-------------------------------
		
		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.WEST);
		frame.add(panel3, BorderLayout.EAST);
		frame.add(panel4, BorderLayout.SOUTH);
		frame.add(panel5, BorderLayout.CENTER);
		
		frame.setVisible(true);
		
		*/
		
		
		
		//------------------------------------------------------------------------------------------
		
		
		
		
		//new MyFrame();
		
		
		
		
		//------------------------------------------------------------------------------------------
		
		
		
		
		/*
		 * 
		 * JPANELS
		 * 
		
		//my image
		ImageIcon cat = new ImageIcon("chat.png");
		
		//my label
		JLabel label = new JLabel();
		label.setIcon(cat);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
		
		//my panels
		JPanel redPanel = new JPanel(new BorderLayout());
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(0, 0, 500, 250);
				
		JPanel bluePanel = new JPanel(new BorderLayout());
		bluePanel.setBackground(Color.cyan);
		bluePanel.setBounds(500,0,500,250);
		
		
		//my window
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(1000, 500);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setLayout(null);//delete the window layout for the panels to be sized #absolute positioning!!
		frame.add(redPanel);// add the panel to the frame
		frame.add(bluePanel);
		bluePanel.add(label);// add the label (img+txt)
		frame.getContentPane().setBackground(Color.blue);//change the color of background
		frame.getContentPane().setBackground(new Color(0,123,123)); //RGB or Hex (with 0xF8C471 for example)
		 */
		
		
		
		
		//------------------------------------------------------------------------------------------
		
		
		
		
		/*
		 * 
		 * LABELS
		 * 
		 * 
		 
		ImageIcon image = new ImageIcon("mushroom.png");
		
		Border border = BorderFactory.createLineBorder(Color.black, 5);
		
		JLabel label = new JLabel(); //create a label
		//label.setText("Coucou"); //set the text of a label
		label.setIcon(image); //display the imageicon
		
		//label.setHorizontalTextPosition(JLabel.CENTER); // text position LEFT, CENTER, RIGHT of label
		//label.setVerticalTextPosition(JLabel.TOP); // text position TOP, CENTER, BOTTOM of label
		
		//label.setHorizontalAlignment(SwingConstants.CENTER); // image position LEFT, CENTER, RIGHT
		//label.setVerticalAlignment(SwingConstants.CENTER); // image position TOP, CENTER, BOTTOM
		
		//label.setHorizontalAlignment(JLabel.CENTER); // image + text position LEFT, CENTER, RIGHT
		//label.setVerticalAlignment(JLabel.CENTER); // image + text position TOP, CENTER, BOTTOM
		
		label.setForeground(Color.BLUE); //change the color of the font
		label.setFont(new Font("MV BOLI", Font.BOLD, 50)); // create your font
		label.setIconTextGap(75); // gap between label and image on the y-direction (could be + or - number)
		label.setBackground(Color.cyan);
		label.setOpaque(true);
		label.setBorder(border);
		label.setBounds(0, 0, 750, 750); // x, y, width, height for the layout
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.add(label);//by default, it goes left-centered
		frame.setLayout(null); // create a layout
		//frame.pack();// adjust to fit with the components, you have to add all the components with .add(label), if not, does not work!
		
		*/
		
		
		//------------------------------------------------------------------------------------------
		
		
		
		/*
		 * 
		 * FRAME = Window
		 * 
		 * 
		JFrame frame = new JFrame();//create a frame, not visible yet
		frame.setVisible(true); //make frame visible
		frame.setSize(500, 550); //set the size of the frame (width, height)
		frame.setResizable(false); //allow resize or not
		frame.setTitle("Title is here"); //title of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of the application
		
		ImageIcon image = new ImageIcon("mushroom.png"); //create an ImageIcon
		frame.setIconImage(image.getImage()); //change icon of frame
		//frame.getContentPane().setBackground(Color.blue);//change the color of background
		frame.getContentPane().setBackground(new Color(0,123,123)); //RGB or Hex (with 0xF8C471 for example)
		*/

		
		//------------------------------------------------------------------------------------------
		
		
		
		/*
		 * 
		 * AUDIO / MUSIC / SOUND
		 * 
		 * 
		 * 
		 * throws UnsupportedAudioFileException, IOException, LineUnavailableException = add to the main, like implements or extends
		Scanner scanner =  new Scanner(System.in);
		
		File file = new File ("sound.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip(); //pre-load the music file
		clip.open(audioStream);
		
		
		String response = "";
		
		while (!response.equals("Q")) {
			System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
			System.out.println("Your choice = ");
			response = scanner.next();
			response = response.toUpperCase();
			
			switch(response){
			
				case "P" : clip.start();
						   System.out.println("Music started");
				break;
				case "S" : clip.stop();
						   System.out.println("Music stopped");
				break;
				case "R" : clip.setMicrosecondPosition(0); //for resetting to the beginning
				   System.out.println("Music resetted");
				break;		
				case "Q" : clip.close();
					System.out.println("You quit the music");
				break;
				default: System.out.println("Not a valide response!");		
							
		
			}
		}scanner.close();
	
		 */
		
		
	}
			
		
}
		
		
		
		
		
		//------------------------------------------------------------------------------------------




		/*
		 * 
		 * FILE
		 * 
		 
		File file = new File ("essai.txt");
	
		
		if(file.exists()) {
			System.out.println("The file exists!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
		}else {
			System.out.println("It doesn't exist!");
		}
		
		
		try {
			FileWriter writer = new FileWriter("essai.txt");
			writer.write("My name is Damien \nViolets are blue \nhi hi hi hi");
			writer.append("essai");
			writer.close(); // obligatoire
			
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//**************************************************
		try {
			FileReader reader = new FileReader("essai.txt");
			int data = reader.read();
			while (data != -1) {
				System.out.print((char)data);//cast the new value, print to read char by char
				data = reader.read();//to keep reading the file char by char
			}
			reader.close(); //to close the FileReader
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		//------------------------------------------------------------------------------------------
		/*
		Personne Damien = new Personne("Damien", 172.5, 33, "21/05/1989", "yeux bleus");
				
		System.out.println(Damien);
		
		Damien.walk();
		
		*/
		
		//------------------------------------------------------------------------------------------
		/*
		 * 
		 * OVERLOAD METHODS
		 * 
		 
		String myString = "Damien"; //%s
		char myChar = '€'; //%c
		int myInt = 33; //%d
		double myDouble= 5000; // %f
		boolean myBool = true; //%b
		
		
		System.out.printf("%s \n", myString);
		System.out.printf("%c \n",myChar);
		System.out.printf("%d \n",myInt);
		System.out.printf("%f \n", myDouble);
		System.out.printf("%b \n", myBool);
		
		//[width]
				// minimum number of characters to be written as output
				//System.out.printf("Hello %10s",myString);
				
		//[precision]
				// sets number of digits of precision when outputting floating-point values
				//System.out.printf("You have this much money %,f",myDouble); //ex: %02f =
				
		// [flags]
				// adds an effect to output based on the flag added to format specifier
				// - : left-justify
				// + : output a plus ( + ) or minus ( - ) sign for a numeric value, for the (-) directly on the variable
				// 0 : numeric values are zero-padded
				// , : comma grouping separator if numbers > 1000
				  
				 
		*/
		//------------------------------------------------------------------------------------------
		
		
		/*
		 * 
		 * METHODS
		 * 
		 * 
		String name = "Damien";
		int age = 33;
		int x = 3;
		int y = 4;
		
		hello(name, age);
		System.out.println(x +"+"+ y +"="+calcul(x, y));
		*/
	//}	
	/*
	static void hello (String name,int age) {
		System.out.println("Hello "+name+" you are "+age+" !");
	}
	static int calcul(int x , int y) {
		int result = x + y ;
		return result;
	}
		*/
		
		
		//------------------------------------------------------------------------------------------
		/*
		 * 
		 * ARRAYLIST and ForEach loop
		 * 
		 * 
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("annanas");
		fruits.add("banane");
		fruits.add("citron");
		
		ArrayList<String> legumes = new ArrayList<String>();
		legumes.add("artichaut");
		legumes.add("brocoli");
		legumes.add("choux-fleur");
		
		ArrayList<String> boissons = new ArrayList<String>();
		boissons.add("Coca-cola");
		boissons.add("Ice Tea");
		boissons.add("Fanta");	
		
		ArrayList<ArrayList<String>> shopping = new ArrayList<ArrayList<String>>();
		shopping.add(fruits);
		shopping.add(legumes);
		shopping.add(boissons);
//		System.out.println(shopping);
//		System.out.println(shopping.get(0));
//		System.out.println(shopping.get(0).get(0));
		
		//FOR EACH loop:
		for (ArrayList<String> produits : shopping) {
			System.out.println(produits);
			System.out.println(produits.get(0));
		}
		
		String[] couleur = {"bleu","rouge","noir","vert"};
		for (String produits : couleur) {
			System.out.println(produits);
		}
		*/
		
		//------------------------------------------------------------------------------------------
		 
		 //ARRAYLIST
		  
		/* 
		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("sushi");
		food.add("KFC");
		food.add("MacDo");
		food.add("B.K");
			
		for (String resto : food) {
			System.out.println(resto);
		}
		*/
		
		
		
		//------------------------------------------------------------------------------------------
		/*
		 * 
		 * PRIMITIVE and WRAPPER CLASS
		 * 
		 */
				// wrapper class = 	provides a way to use primitive data types as reference data types
				//					reference data types contain useful methods
				//					can be used with collections (ex.ArrayList)
				
				//primitive		//wrapper
				//---------		        //-------
				// boolean		Boolean
				// char			Character
				// int			Integer
				// double		Double
				
				// autoboxing = the automatic conversion that the Java compiler makes between the primitive types 
				// 				and their corresponding object wrapper classes
				// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
				/*
				Boolean a = true;
				Character b = '@';
				Integer c = 123;
				Double d = 3.14;
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				*/
				//permit to access to some functions according to the type
				//it is better to use primitive (easier and faster!)
			
		//------------------------------------------------------------------------------------------
		/*
		 * 
		 * Some useful String functions 
		 * 
		 * 
		String name = "Damien is about to be Damned";
		//boolean result = name.equals("Damien");
		//int result = name.length(); //counts all the letters / spaces / symbols without the ""
		//char result = name.charAt(0);// find the letter at a specific index
		//int result = name.indexOf("a"); //find the index of a specific letter
		//boolean result = name.isEmpty(); // ask if the variable is empty (true = is empty // false = is not empty)
		//String result = name.toUpperCase();
		//String result = name.toLowerCase();
		//String result = name.trim();
		String result = name.replaceAll("Dam","JUL");
		System.out.println(result);
		*/
		
		//------------------------------------------------------------------------------------------
		
		/*
		 * 
		 * 2D ARRAY 
		 * 
		 
		
		String[][] pokemon = new String[3][3];
		
		pokemon[0][0] = "Bulbizarre";
		pokemon[0][1] = "Herbizarre";
		pokemon[0][2] = "Florizarre";
		pokemon[1][0] = "Carapuce";
		pokemon[1][1] = "Carabaffe";
		pokemon[1][2] = "Tortank";
		pokemon[2][0] = "Salameche";
		pokemon[2][1] = "Reptincel";
		pokemon[2][2] = "Dracaufeu";
		
		for (int i = 0 ; i < pokemon.length ; i++) {
			System.out.println();
			for (int j = 0 ; j < pokemon[i].length ; j++) {
				//System.out.print(pokemon[i][j]+ " "); // display in line, in rows
				System.out.println(pokemon[i][j]); // display in paragraph, in columns
				
			}
		}
		
		
		//another way to create 2D array
		
		String[][] pokedex = {	{"Bulbizarre","Herbizarre","Florizarre"},
								{"Carapuce","Carabaffe", "Tortank"},
								{"Salameche","Reprincel", "Dracafeu"}	
							};
		
		System.out.println(pokedex[0][0]);
		
		for (int i = 0 ; i < pokedex.length ; i++) {
			System.out.println();
			for (int j = 0 ; j < pokedex[i].length ; j++) {
				//System.out.print(pokedex[i][j]+ " "); // display in line, in rows
				System.out.println(pokedex[i][j]); // display in paragraph, in columns
				
			}
		}
		*/
		
		//------------------------------------------------------------------------------------------
		
		/*
		 * 
		 * ARRAY (numeric)
		 * 
		 */
		
		//String[] cars = {"car 0", "car 1", "123"};
		
		//cars[0] = "car 3"; //replace the value at the index
		
		//System.out.println(cars[0]);
		//System.out.println(cars[1]);
		//System.out.println(cars[2]);
		
			//another way to create arrays
		/*
		String[] cars = new String[3]; // you put directly the number of values
		cars[0]= "Renault";
		cars[1]="Volvo";
		cars[2]= "BMW";
		
		System.out.println(cars[0]);
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println("The car is "+cars[i]+"!");
		}
		*/
		
		
		//------------------------------------------------------------------------------------------
		/*
		 * 
		 * FOR in FOR (nested FOR) with Scanner
		 * 
		 *
		Scanner scanner = new Scanner (System.in);
		//int rows = 3, columns = 5;
		int rows; 
		int columns;
		String symbol = "";
		
		System.out.println("Number of rows ?");
		rows = scanner.nextInt();
		System.out.println("Number of columns ?");
		columns = scanner.nextInt();
		System.out.println("What symbol ?");
		symbol = scanner.next();
		
		
		for(int i = 1; i <= rows; i++ ) {
			System.out.println();
			for (int j = 1; j <= columns; j ++) {
				System.out.print(symbol);  // to display only the symbol and not just a line with println
			}
		}
		
		*/
		
				
		//------------------------------------------------------------------------------------------
		/*
		 * 
		 * FOR LOOP and nested LOOP (FOR in FOR)
		 *  
		 * 
		for(int i = 1; i < 6; i++){
			System.out.println("row number ==========" +i);
			for (int j=1; j < 6; j++) {
				System.out.println("I have a tree" +j);
			}
			
		}
		System.out.println("There is no forest anymore :( ");
		*/
		
		//------------------------------------------------------------------------------------------
		
		/*
		// WHILE LOOP = execution of a block of code as long as its condition remains true
		Scanner scanner = new Scanner (System.in);
		
		String name = "";
		
		while (name.isBlank()) {
			System.out.println("Enter your name");
			name = scanner.nextLine();
		}
		System.out.println("Hello "+name);
		*/
		//------------------------------------------------------------------------------------------
		/*
		 * 
		 * LOGICAL OPERATORS: && (and), || (or), !(not or the opposite ONLY USE with text)
		 * 
		 * 
		Scanner scanner = new Scanner(System.in); // allow to ask the user to enter a data in terminal
		
		System.out.println("Press q or Q to exit");
		String response = scanner.next();
		
		if (response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		}else {
			System.out.println("You are still in the game");
		}
		*/
		//------------------------------------------------------------------------------------------
		/*
		 * 
		 * IF...ELSE IF... ELSE with DISPLAY INPUT and LOGICAL OPERATOR: &&
		 * 
		 * 
	int temp = Integer.parseInt(JOptionPane.showInputDialog("What is the temperature ??"));
		if(temp > 30) {
			JOptionPane.showMessageDialog(null,"Yes, it is hot !!!");
		}
		else if (temp >=20 && temp <30 ) {
			JOptionPane.showMessageDialog(null,"Yes, it is warm !!!");
		}else{
			JOptionPane.showMessageDialog(null,"Yes, it is cold !!!");
		}
		*/
		
		//------------------------------------------------------------------------------------------
	
	/*
	 * 
	 * SWITCH...CASE with DISPLAY INPUT 
	 * 
	 * 
	 * String day = JOptionPane.showInputDialog("What day is it ?");
	 
	if (d == day) {
		switch(d) {
			case "Monday" : JOptionPane.showMessageDialog(null, "It is = "+ day);
			break;
			case "Tuesday" : JOptionPane.showMessageDialog(null, "It is = "+ day);
			break;
			case "Wednesday" : JOptionPane.showMessageDialog(null, "It is = "+ day);
			break;
			case "Thursday" : JOptionPane.showMessageDialog(null, "It is = "+ day);
			break;
			case "Friday" : JOptionPane.showMessageDialog(null, "It is = "+ day);
			break;
			case "Saturday" : JOptionPane.showMessageDialog(null, "It is = "+ day);
			break;
			case "Sunday" : JOptionPane.showMessageDialog(null, "It is = "+ day);
			break;
		}
			
	}else {
		
		JOptionPane.showMessageDialog(null, "You are wrong!");
	*/
				
	

		
		//------------------------------------------------------------------------------------------
		/*
		 * 
		 * TO USE RANDOM (example: a dice)
		 * 
		 * 
		Random random = new Random();
		
		int x = random.nextInt(1,7); // from 0 to 5 (so 6 numbers), add +1 to go to 6 
		System.out.println(x);
		*/
		//------------------------------------------------------------------------------------------
		/*
		 * 
		 * TO DISPLAY AN INPUT TO ASK SOMETHING TO USERS
		 * 
		 * 
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name+" let's calculate the hypotenuse");
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Enter side a"));
		//JOptionPane.showMessageDialog(null, "Your are " +age);
		
		double b = Double.parseDouble(JOptionPane.showInputDialog("Enter side b"));
		//JOptionPane.showMessageDialog(null, "Your are " +height+ "m !!");
		
		double c = Math.sqrt((a*a)+(b*b));
		JOptionPane.showMessageDialog(null, "The answer is : " +c);
		*/
		//------------------------------------------------------------------------------------------
		
		/*
		 * TO CALCULATE
		 * 
		double x = 3.14;
		double y = 25.8;
		
		double calcul = Math.floor(y);
		System.out.println(calcul);
		*/
		

	

	
	
	


