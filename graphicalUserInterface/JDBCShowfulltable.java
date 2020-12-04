package graphicalUserInterface;

import java.sql.*;      
import java.util.Scanner;

public class JDBCShowfulltable {
    public static void main(String[] args) throws Exception{
        Scanner kb = new Scanner(System.in);
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhms", "root", "abcd");
        Statement st = con.createStatement();
        System.out.print("enter query:");
        String query = kb.nextLine();
        
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()) {
            String data = rs.getInt(1) + " " + rs.getString(2);
            System.out.println(data);
        }
        st.close();
        con.close();  
    }
}
