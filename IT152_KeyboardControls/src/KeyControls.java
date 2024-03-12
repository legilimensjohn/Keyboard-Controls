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
		super("Keyboard Controls");		//Assign a title to the JFrame
		p = new JPanel (new GridLayout(2,14));	//Generate a JPanel that will hold JLabels in a grid layout
		p.setBackground(Color.ORANGE);
		add(p);							//Append the JPanel to the JFrame
		
		//Declare an array of JLabels that will represent letters from A to Z
		letLabels = new JLabel[26];		
		for (char c = 'A'; c <= 'Z'; c++) {
			letLabels [c - 'A'] = new JLabel(String.valueOf(c));	//Construct a label that will display the letter
			letLabels [c - 'A'].setOpaque(true);		//Display the label's background color
			letLabels [c - 'A'].setBackground(Color.CYAN);	//Assign the background color of the label to cyan
			letLabels [c - 'A'].setHorizontalAlignment(JLabel.CENTER);		//Horizontally center the text of the label
			letLabels [c - 'A'].setVerticalAlignment(JLabel.CENTER);		//Vertically center the text of the label
			letLabels [c - 'A'].setFont(letLabels [c - 'A'].getFont().deriveFont(30.0f));	//Adjust the size of the font
			p.add(letLabels [c - 'A']);		//Place the the label onto the JPanel
		}
		
		p.setFocusable(true);		//Enable the JPanel to receive keyboard events by making it focusable
		p.addKeyListener(new MyKList(letLabels));	//Attach a customized KeyListener to the JPanel
		setSize(500,500);			//Specify the dimensions of the JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Define the action to be taken when the window close button is pressed
		setVisible(true);				//Ensure that the JFrame is visible
	}

}
