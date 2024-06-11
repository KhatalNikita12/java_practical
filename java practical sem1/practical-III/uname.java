import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class InvalidException extends Exception{
    InvalidException(String s)
    {
        super(s);
    }
}
class uname extends Frame implements ActionListener
{
   
    Button btnlogin,btnclear;
    Label lblname,lblpass;
    TextField name,pass;
    int chance=3;
    public static void main(String[] args)
    {
        uname u=new uname();
    }
    uname()
    {
setTitle("login page");
setSize(400,500);
setLayout(new FlowLayout());
lblname=new Label(" enter user name");
add(lblname);
name=new TextField(20);
add(name);
lblpass=new Label(" enter  password");
add(lblpass);
pass=new TextField(20);
add(pass);
btnlogin=new Button("login");
add(btnlogin);
btnlogin.addActionListener(this);
btnclear=new Button("clear");
add(btnclear);
btnclear.addActionListener(this);
    
 addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
 });
 setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
{
         if(chance==0){
        JOptionPane.showMessageDialog(this,"sorry  ");
    System.exit(0);
    }
    try{
    if(ae.getSource()==btnlogin){
        if(!name.getText().equals("Admin")){
            JOptionPane.showMessageDialog(this,"invalid  user name ");
            throw new InvalidException("incorrect username");
            
        }
        else  if(!pass.getText().equals("pass123")){
            JOptionPane.showMessageDialog(this,"invalid password ");
            throw new InvalidException("incorrect password");
        }
        else{
            
            JOptionPane.showMessageDialog(this,"valid user name and password ");
        }
    }
    else if(ae.getSource()==btnclear){
    name.setText(" ");
    pass.setText(" ");
    }
   
}

    catch(Exception e){
    chance--;
    System.out.println(e);
    }
    }
}
