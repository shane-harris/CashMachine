import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Display extends JLabel implements ActionListener
{
	String output = " ";
	static String message = "Enter Your PIN";
	public Display() 
	{
		super(message,RIGHT);
		setBorder(BorderFactory.createEtchedBorder());
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String selection = e.getActionCommand();
		
			if(selection == "C") {
				output = " ";
				setText(message);
				setForeground(Color.GRAY);
			}
			
			if(selection == "Del") {
				if(output == " ")
				{
					//Condition needed to prevent decrement when output.lenght() is 0
					output = output;
				} 
				else
				{
					output = output.substring(0,output.length() - 1);
				}
				setText(output);
				setForeground(Color.RED); 
			}
			else {
				output = output.concat(selection);
				setText(output);
				setForeground(Color.RED);
				output = output.replace(selection.charAt(0),'*');
			}
		
		}
	
}
