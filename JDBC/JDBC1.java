import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

class JDBC1{
    public static void main(String args[]) throws SQLException{
        String url="jdbc:postgresql://localhost/stud";
        Connection conn=null;
        int rno=6;
        String name="sita";
        String city="pune";
        // String sql="insert into student(rno,name,city)"+"values("+rno+",'"+name+"',"+",'"+city+"')";
        String sql = "insert into student(rno, name, city) values (" + rno + ", '" + name + "', '" + city + "')";

        try{
            conn=DriverManager.getConnection(url,"postgres","123");
            Statement st=conn.createStatement();
            int m=st.executeUpdate(sql);
            if(m == 1)
                System.out.println("inserted successfully"+sql);
            else    
                System.out.println("inserted failed");

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
    }
}