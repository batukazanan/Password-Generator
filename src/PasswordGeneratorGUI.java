import javax.swing.*;

// render the GUI Components (frontend)
// this class will inherit from the JFrame class
public class PasswordGeneratorGUI extends JFrame {
    public PasswordGeneratorGUI(){
        // render frame and add a title
        super("Password Generator");

        // set the size of the GUI
        setSize(540,570);

        // prevent GUI from being able to resized
        setResizable(false);

        // we will set the layout to be null to have control over the position and size of our components in our app
        setLayout(null);

        // terminate the program when the GUI is closed (ends the process)
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // center the GUI to the screen
        setLocationRelativeTo(null);
    }
}
