import java.sql.*;

public class file3  {
public static void main(String args[]){

    try{

        Connection  con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","123");
        Statement stmt=con.createStatement();
        DatabaseMetaData dbmd=con.getMetaData();
        Class.forName("org.postgresql.Driver");
        ResultSet rs=stmt.executeQuery("select * from student");
        ResultSetMetaData rsmd=rs.getMetaData();
        int noofcol=rsmd.getColumnCount();
        System.out.println("number of column"+noofcol);
for(int i=1;i<=noofcol;i++){
    System.out.println("column no:"+i);
    System.out.println("column name:"+rsmd.getColumnName(i));
    System.out.println("Column type:"+rsmd.getColumnTypeName(i));
    System.out.println("column dispaly type:"+rsmd.getColumnDisplaySize(i));
}
        con.close();
    }
    catch (Exception e){
        System.out.println(e);
    }
}
    }