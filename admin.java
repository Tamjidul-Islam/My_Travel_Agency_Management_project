import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Button Example");

        // Create a new JPanel
        JPanel panel = new JPanel();

        // Create a new JButton
        JButton button = new JButton("Sign up");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show a dialog when the button is clicked
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Add the button to the panel
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the frame size
        frame.setSize(300, 200);

        // Make the frame visible
        frame.setVisible(true);
    }
}