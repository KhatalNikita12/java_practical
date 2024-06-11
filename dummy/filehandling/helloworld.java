import java.awt.*;
import javax.swing.*;
class helloworld extends JFrame{
    JLabel label;
    public static void main(String[] args) {
        helloworld hw=new helloworld();
    }
    helloworld(){
        setTitle("hello world using swing");
        setLayout(new FlowLayout());
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("hello world");
        add(label);
        setVisible(true);
    }
}