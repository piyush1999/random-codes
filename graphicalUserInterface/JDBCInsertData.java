package graphicalUserInterface;

import java.sql.*;
import java.util.*;

public class JDBCInsertData {
    
    public static void main(String[] args) throws Exception{
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhms", "root", "abcd");
        Scanner kb = new Scanner(System.in);
        System.out.print("enter query: ");
        String query = kb.nextLine();
        PreparedStatement pst = con.prepareStatement(query);
        
        int count = pst.executeUpdate();
        System.out.println(count + " " + "row affected");
        pst.close();
        con.close();
    }
}
