import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class c11 extends JFrame implements ActionListener {
    JLabel lbl=new JLabel("Traffic Light");
    JRadioButton rb1=new JRadioButton();
    JRadioButton rb2=new JRadioButton();
    JRadioButton rb3=new JRadioButton();
    ButtonGroup bg=new ButtonGroup();
    JButton ok;
    JLabel red;
    JLabel yellow;
    JLabel green;
    c11(){
        setTitle("traffic Light");
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        red=new JLabel("STOP");
        // add(red);
        red.setForeground(Color.red);
        yellow=new JLabel("Ready");
        // add(yellow);
        yellow.setForeground(Color.yellow);
        green=new JLabel("GO");
        // add(green);
        green.setForeground(Color.green);
         ok=new JButton("ok");
         add(ok);
         ok.addActionListener(this);
         bg.add(rb1);
         bg.add(rb2);
         bg.add(rb3);
         setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

    }
  public static void main(String[] args) {
    new c11();
  }

}
