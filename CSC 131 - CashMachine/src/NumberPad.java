import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A numeric keypad
 */
public class NumberPad extends JPanel 
{
	private ActionListener listen;
    /**
     * Default Constructor
     */
    public NumberPad(ActionListener listen)
    {
        super();
        this.listen = listen;
        setupLayout();
    }

    /**
     * Setup and layout this NumberPad
     */
    private void setupLayout()
    {
        // Setup and layout this NumberPad
    	JButton[] buttons = new JButton[12];
    	setLayout(new GridLayout(4,3));
    	addButton(buttons);
    }
    
    private JButton[] addButton(JButton buttons[]) {
    	
    	for(Integer i=0; i < buttons.length;i++) {
    		buttons[i] = new JButton();
    		buttons[i].addActionListener(listen);
    		if(i<=9) {
    			buttons[i].setText(i.toString());
    			//buttons[i].setText("test");
    			if(i>0)
    				add(buttons[i]);
    		}
    		if(i==10) {
    			buttons[i].setText("Del");
    		}
    		/*if(i==10) {
    			buttons[i].setText("0");
    		}*/
    		if(i==11) {
    			buttons[i].setText("C");
    		}
    	}
    	add(buttons[10]);
    	add(buttons[0]);
    	add(buttons[11]);
    	return buttons;
    }
}

