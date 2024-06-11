import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class add extends JFrame implements ActionListener{
    JLabel lresult,l1,l2;
    JTextField txtresult,t1,t2;
    JButton btnadd,btnrev,btnclr;
    public static void main(String[] args) {
        add a=new add();
    }
    add(){
        setTitle("addition");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2,20,20));
        l1=new JLabel("enter 1 number");
        add(l1);
        t1=new JTextField(20);
        add(t1);
        l2=new JLabel("enter 2nd number");
        add(l2);
        t2=new JTextField(20);
        add(t2);
        lresult=new JLabel("concat");
        add(lresult);
        txtresult=new JTextField(20);
        add(txtresult);
        btnadd=new JButton("concat");
        add(btnadd);
        btnadd.addActionListener(this);
        btnrev=new JButton("reverse");
        add(btnrev);
        btnrev.addActionListener(this);
        btnclr=new JButton("clear");
        add(btnclr);
        btnclr.addActionListener(this);
setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btnadd){
            // int a=Integer.parseInt(t1.getText());
            // int b=Integer.parseInt(t2.getText());
            // int addition=a+b;
            // txtresult.setText(addition+" ");
            txtresult.setText(t1.getText()+" "+t2.getText());
        }
        else if(ae.getSource()==btnrev){
            //  t1.setText(" ");
            //  t2.setText(" ");
            //  txtresult.setText(" ");
            StringBuffer sb=new StringBuffer(t1.getText()+" "+t2.getText());
            // System.out.println(sb.reverse());
            txtresult.setText(sb.reverse().toString());
        }
         else if(ae.getSource()==btnclr){
            txtresult.setText(" ");
            t1.setText(" ");
            t2.setText(" ");
         }
    }
}
