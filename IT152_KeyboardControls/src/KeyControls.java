import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyControls extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel p;
	private JLabel[] letLabels;
	
	//Instantiate the KeyControls class by calling its contructor, which extends JFrame
	public KeyControls() {		

		//Assign a title to the JFrame
		super("Keyboard Controls");		

		//Generate a JPanel that will hold JLabels in a grid layout
		p = new JPanel (new GridLayout(2,14));	
		
		p.setBackground(Color.ORANGE);

		//Append the JPanel to the JFrame
		add(p);							
		
		//Declare an array of JLabels that will represent letters from A to Z
		letLabels = new JLabel[26];		
		for (char c = 'A'; c <= 'Z'; c++) {

			//Construct a label that will display the letter
			letLabels [c - 'A'] = new JLabel(String.valueOf(c));	
			
			//Display the label's background color
			letLabels [c - 'A'].setOpaque(true);		
			
			//Assign the background color of the label to cyan
			letLabels [c - 'A'].setBackground(Color.CYAN);	

			//Horizontally center the text of the label
			letLabels [c - 'A'].setHorizontalAlignment(JLabel.CENTER);	

			//Vertically center the text of the label
			letLabels [c - 'A'].setVerticalAlignment(JLabel.CENTER);		

			//Adjust the size of the font
			letLabels [c - 'A'].setFont(letLabels [c - 'A'].getFont().deriveFont(30.0f));	

			//Place the the label onto the JPanel
			p.add(letLabels [c - 'A']);		
		}
		
		//Enable the JPanel to receive keyboard events by making it focusable
		p.setFocusable(true);		
		
		//Attach a customized KeyListener to the JPanel
		p.addKeyListener(new MyKList(letLabels));	
		
		//Specify the dimensions of the JFrame
		setSize(500,500);	
		
		//Define the action to be taken when the window close button is pressed		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		//Ensure that the JFrame is visible
		setVisible(true);				
	}

}
