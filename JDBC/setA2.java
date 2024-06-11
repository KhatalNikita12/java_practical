
import java.sql.*;

public class setA2  {
public static void main(String args[]){

    try{
//        Connection con=null;
        Connection  con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","123");
        DatabaseMetaData dbmd=con.getMetaData();
        Class.forName("org.postgresql.Driver");

        System.out.println("Driver Name:"+dbmd.getDriverName());
        System.out.println("Driver version"+dbmd.getDriverVersion());
        System.out.println("UserName"+dbmd.getUserName());
        System.out.println("Database product name"+dbmd.getDatabaseProductName());
        System.out.println("database product version "+dbmd.getDatabaseProductVersion());
        String table[]={"TABLE"};
        ResultSet rs=dbmd.getTables(null,null,null,table);
        while (rs.next()){
            System.out.println(rs.getString(3));
        }
        con.close();
    }
    catch (Exception e){
        System.out.println(e);
    }
}
    }



