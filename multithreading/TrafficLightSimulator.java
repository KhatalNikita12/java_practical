import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TrafficLightSimulator extends JFrame {
    JLabel title_lbl = new JLabel("Traffic Light Simulator");

    JRadioButton rb1 = new JRadioButton("Red");
    JRadioButton rb2 = new JRadioButton("Yellow");
    JRadioButton rb3 = new JRadioButton("Green");

    JButton ok = new JButton("OK");

    ButtonGroup g1 = new ButtonGroup();

    JLabel messageLabel = new JLabel("");

    TrafficLightSimulator() {
        setLayout(new FlowLayout());
        setSize(300, 200);
        setTitle("Traffic Light Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));

        rb1.setForeground(Color.red);
        rb2.setForeground(Color.yellow);
        rb3.setForeground(Color.green);

        g1.add(rb1);
        g1.add(rb2);
        g1.add(rb3);

        add(title_lbl);
        add(rb1);
        add(rb2);
        add(rb3);
        add(ok);
        add(messageLabel);

        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == ok) {
                    Thread trafficThread = new Thread(new Runnable() {
                        public void run() {
                            try {
                                if (rb1.isSelected()) {
                                    showRed();
                                } else if (rb2.isSelected()) {
                                    showYellow();
                                } else if (rb3.isSelected()) {
                                    showGreen();
                                }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    trafficThread.start();
                }
            }
        });

        setVisible(true);
    }

    private void showRed() throws InterruptedException {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                messageLabel.setText("STOP");
                messageLabel.setForeground(Color.red);
            }
        });
        Thread.sleep(3000); // Simulate red for 3 seconds
    }

    private void showYellow() throws InterruptedException {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                messageLabel.setText("READY");
                messageLabel.setForeground(Color.yellow);
            }
        });
        Thread.sleep(2000); // Simulate yellow for 2 seconds
    }

    private void showGreen() throws InterruptedException {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                messageLabel.setText("GO");
                messageLabel.setForeground(Color.green);
            }
        });
        Thread.sleep(3000); // Simulate green for 3 seconds
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TrafficLightSimulator();
            }
        });
    }
}
