import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;

class MyKList implements KeyListener {
	
	private JComponent[] letLabels;
	
	//Contructor that accepts an array comprising JComponents elements
	public MyKList (JComponent[] letLabels) {
		this.letLabels = letLabels;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//This method is invoked when a key is pressed down
	public void keyPressed(KeyEvent e) {	
		
		// TODO Auto-generated method stub
		//Transform the key character to uppercase
		char keyChar = Character.toUpperCase(e.getKeyChar());	

		//Verify if the pressed key falls within the range of A-Z
		if (e.getKeyCode() >= KeyEvent.VK_A && e.getKeyCode() <= KeyEvent.VK_Z) {	

			//Compute the index by considering the key's position in the alphabet
			int index = e.getKeyCode() - KeyEvent.VK_A;		

			//Change the the background color of the corresponding JComponent to a refreshing shade of orange
			letLabels[index].setBackground(Color.ORANGE);	
			
		}
		
	}

	@Override
	//This method is invoked when a key is released
	public void keyReleased(KeyEvent e) {
		
		// TODO Auto-generated method stub
		//Transform the key character to uppercase
		char keyChar = Character.toUpperCase(e.getKeyChar());	

		//Verify if the pressed key falls within the range of A-Z
		if (e.getKeyCode() >= KeyEvent.VK_A && e.getKeyCode() <= KeyEvent.VK_Z) {	
			
			//Compute the index by considering the key's position in the alphabet
			int index = e.getKeyCode() - KeyEvent.VK_A;		
			
			//Alter the background color of the corresponding JComponent to a pristine cyan hue
			letLabels[index].setBackground(Color.CYAN);		
		}
	}

}
