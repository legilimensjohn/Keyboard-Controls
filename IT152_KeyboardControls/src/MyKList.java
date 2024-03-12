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
		char keyChar = Character.toUpperCase(e.getKeyChar());	//Transform the key character to uppercase
		if (e.getKeyCode() >= KeyEvent.VK_A && e.getKeyCode() <= KeyEvent.VK_Z) {	//Verify if the pressed key falls within the range of A-Z
			int index = e.getKeyCode() - KeyEvent.VK_A;		//Compute the index by considering the key's position in the alphabet
			letLabels[index].setBackground(Color.ORANGE);	//Change the the background color of the corresponding JComponent to a refreshing shade of orange
		}
		
	}

	@Override
	//This method is invoked when a key is released
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		char keyChar = Character.toUpperCase(e.getKeyChar());	//Transform the key character to uppercase
		if (e.getKeyCode() >= KeyEvent.VK_A && e.getKeyCode() <= KeyEvent.VK_Z) {	//Verify if the pressed key falls within the range of A-Z
			int index = e.getKeyCode() - KeyEvent.VK_A;		//Compute the index by considering the key's position in the alphabet
			letLabels[index].setBackground(Color.CYAN);		//Alter the background color of the corresponding JComponent to a pristine cyan hue
		}
	}

}
