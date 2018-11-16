import java.awt.*;
import javax.swing.*;
import java.util.Collection;


/**
 * A window containing a PIN entry pad.
 */
public class PINPadWindow extends JFrame
{
    /**
     * Default Constructor.
     */
    public PINPadWindow()
    {
        super();
        setupLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        //setResizable(false);
    }

    /**
     * Setup and layout this PINPadWindow
     */
    private void setupLayout()
    {
        Container     contentPane;
        Display keypad = new Display();
        NumberPad numberpad = new NumberPad(keypad);

        setSize(300, 300); 

        contentPane = getContentPane();

        // Layout this PINPadWindow
        contentPane.setLayout(new BorderLayout());
        contentPane.add(keypad, BorderLayout.NORTH);
        contentPane.add(numberpad, BorderLayout.CENTER);
    }
}
