package com.company;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Main extends JFrame implements ActionListener {
    Connection con;
    ResultSet rs;
    Statement st;
    PreparedStatement pstmt;
    static JTable table;
    String[] columnNames = {"project ID","Project Name", "Project description","project status"};
    JFrame frm;
    JPanel p1;
    int id ;
    String name="",desc="",status="";


    JTextField txtname,txtid,txtdesc,txtstatus;
    JButton b1,b2,b3;
    Main() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("project detail");
        p1=new JPanel();

        p1.setLayout(new GridLayout(8,2,10,10));

        Label l1=new Label("Project Id");
        p1.add(l1);
        txtid=new JTextField(15);
        p1.add(txtid);

        Label l2=new Label(" project name");
        p1.add(l2);
        txtname=new JTextField(15);
        p1.add(txtname);

        Label l3=new Label("project Description");
        p1.add(l3);
        txtdesc=new JTextField(15);
        p1.add(txtdesc);

        Label l4=new Label("project status");
        p1.add(l4);
        txtstatus=new JTextField(15);
        p1.add(txtstatus);

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

                rs = st.executeQuery("select * from project");

                while (rs.next()) {
                    id = rs.getInt(1);
                    name = rs.getString(2);
                    desc = rs.getString(3);
                    status = rs.getString(4);
                    model.addRow(new Object[]{id,name,desc,status});

                }  //while
                frm.add(scroll);

                frm.setVisible(true);
                frm.setSize(400, 400);
            }

            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (ae.getSource() == b2) {
                // System.exit(1);
                txtid.setText("");
                txtname.setText("");
                txtdesc.setText("");
                txtstatus.setText("");

            }
        else if (ae.getSource() == b1) {
          try{
              Class.forName("org.postgresql.Driver");

              con = DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","123");
                pstmt=con.prepareStatement("insert into project values(?,?,?,?)");
                int id= Integer.parseInt(txtid.getText());
                pstmt.setInt(1,id);
              String nm=txtname.getText();
              pstmt.setString(2,nm);
              String ds=txtdesc.getText();
              pstmt.setString(3,ds);
              String st=txtstatus.getText();
              pstmt.setString(4,st);
              int ans=pstmt.executeUpdate();
              JOptionPane.showMessageDialog(this,"record inserted");

          }
          catch (Exception e){
              System.out.println(e);
          }

        }
        }


    public static void main(String args[]) {

        new Main();

    }

}