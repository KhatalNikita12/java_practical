import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class DisplaystudData extends JFrame implements ActionListener {
    Connection con;
    ResultSet rs;
    Statement st;

   static JTable table;
    String[] columnNames = {"Roll no","Name", "Percentage"};
    JFrame frm;
    JPanel p1;
    String rn = "",name="",per="";
         

 JTextField txtname,txtrn,txtper;
 JButton b1,b2,b3;
    DisplaystudData() {

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("STUDENT FORM");
p1=new JPanel();

p1.setLayout(new GridLayout(5,2,10,10));

Label l1=new Label("Rollno");
p1.add(l1);
txtrn=new JTextField(15);
p1.add(txtrn);

Label l2=new Label("name");
p1.add(l2);
txtname=new JTextField(15);
p1.add(txtname);

Label l3=new Label("per");
p1.add(l3);
txtper=new JTextField(15);
p1.add(txtper);

 b1=new JButton("Add");
p1.add(b1);

 b2=new JButton("clear");
p1.add(b2);

 b3=new JButton("Display");
p1.add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);


       
add(p1,BorderLayout.WEST);

        setVisible(true);
        setSize(400, 400);         
           

        
    }

 public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource()==b3)//display
{
frm=new JFrame("Display");
frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frm.setLayout(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);
        table = new JTable();

        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        table.setFillsViewportHeight(true);

        JScrollPane scroll = new JScrollPane(table);

        scroll.setHorizontalScrollBarPolicy(

                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(

                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        

        try {

            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","123");

            st = con.createStatement();

            rs = st.executeQuery("select * from student");

            while (rs.next()) {
                rn = rs.getString(1);
                name = rs.getString(2);
                per = rs.getString(3);
                 model.addRow(new Object[]{rn,name,per});          

            }  //while
frm.add(scroll);

frm.setVisible(true);
        frm.setSize(400, 400);   
}

catch (Exception e) {
              JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
              System.out.println(e);
        }
}
}

    public static void main(String args[]) {

        new DisplaystudData();

    }

}