import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class C1 extends JFrame implements ActionListener {

    JLabel title_lbl;
    JRadioButton rb1, rb2, rb3;
    JButton ok;
    ButtonGroup g1 = new ButtonGroup();
    JLabel red, yellow, green;

    C1() {
        setTitle("Traffic Light Simulator");
        setSize(300, 200);
        setLayout(new GridLayout(8, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        title_lbl = new JLabel("Traffic Light");
        rb1 = new JRadioButton("RED");
        rb2 = new JRadioButton("YELLOW");
        rb3 = new JRadioButton("GREEN");
        red = new JLabel("STOP");
        yellow = new JLabel("READY");
        green = new JLabel("GO");
        
        red.setForeground(Color.red);
        yellow.setForeground(Color.yellow);
        green.setForeground(Color.green);
        Font font = new Font("Serif", Font.BOLD, 24); 
        red.setFont(font);
        yellow.setFont(font);
        green.setFont(font);
        
        g1.add(rb1);
        g1.add(rb2);
        g1.add(rb3);

        add(title_lbl);
        add(rb1);
        add(rb2);
        add(rb3);

        ok = new JButton("OK");
        add(ok);
        ok.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == ok) {
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        if (rb1.isSelected()) {
                            showRed();
                        } else if (rb2.isSelected()) {
                            showYellow();
                        } else if (rb3.isSelected()) {
                            showGreen();
                        }
                    } catch (Exception e) {
                       System.out.println(e);
                    }
                }
            };
            
            new Thread(runnable).start();
            
            
        }
    }

     void showRed() throws InterruptedException {
       
        getContentPane().removeAll();
        add(title_lbl);
        add(rb1);
        add(rb2);
        add(rb3);
        add(ok);
        add(red);
        revalidate();
        repaint();
        Thread.sleep(3000);
        showYellow();
    }
    
     void showYellow() throws InterruptedException {
      
        getContentPane().removeAll();
        add(title_lbl);
        add(rb1);
        add(rb2);
        add(rb3);
        add(ok);
        add(yellow);
        revalidate();
        repaint();
        Thread.sleep(2000);
        showGreen();
    }
    
     void showGreen() throws InterruptedException {
        
        getContentPane().removeAll();
        add(title_lbl);
        add(rb1);
        add(rb2);
        add(rb3);
        add(ok);
        add(green);
        revalidate();
        repaint();
        Thread.sleep(3000);
        showRed();
    }
    

    public static void main(String args[]) {
        new C1();
    }
}
