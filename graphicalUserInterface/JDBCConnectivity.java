package graphicalUserInterface;

import java.sql.*;
import java.util.Scanner;

public class JDBCConnectivity {
    public static void main(String[] args) throws Exception{
        Scanner kb = new Scanner(System.in);
        System.out.print("enter id :");
        int id = kb.nextInt();
        
        String query = "SELECT s_name from STUDENT where s_id = " + id +";";
        Class.forName("com.mysql.jdbc.Driver");//loading drivers
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhms", "root", "abcd");
        Statement st = conn.createStatement();
        
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String name = rs.getString("s_name");
        System.out.println(name);
        
        st.close();
        conn.close();
    }
}
