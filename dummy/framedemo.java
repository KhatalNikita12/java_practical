/**
 * framedemo
 */
import javax.swing.*;
import java.awt.*;
public class framedemo extends JFrame {
    public static void main(String[] args) {
        framedemo frame = new framedemo();
        frame.setTitle("My frame");
        frame.setSize(400, 500);
        frame.setLayout(new FlowLayout()); // Uncomment this line to set the layout manager
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Uncomment this line to set default close operation

        JOptionPane.showMessageDialog(frame, "hello world");
        frame.setVisible(true); // You may want to uncomment this line to make the frame visible
    }
}
