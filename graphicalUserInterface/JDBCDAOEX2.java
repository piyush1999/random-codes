package graphicalUserInterface;

import java.sql.*;

public class JDBCDAOEX2 {
    public static void main(String[] args) {
        StudentsDAO dao = new StudentsDAO();
        Students s1 = new Students();
        s1.s_id = 5;
        s1.s_name = "rahul";
        dao.connection();
        dao.addStudent(s1);
    }
}

class StudentsDAO {
    Connection con;
    // FUNCTION FOR SETTING UP A CONNECTION BETWEEN JAVA CODE AND DATABASE..
    public void connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhms", "root", "abcd");
            System.out.println("Connection Successful...");
        } catch (ClassNotFoundException | SQLException cnfex) {
            System.out.println(cnfex);
        }
    }
    // FUNCTION FOR ADDING A NEW STUDENT IN DATABASE..
    public void addStudent(Students s) {
        
        try {
            String query = "INSERT INTO STUDENT VALUES(?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, s.s_id);
            pst.setString(2, s.s_name);
            pst.executeUpdate();
            
        } catch (SQLException sqlex) {
            System.out.println(sqlex);
        }
    }
}

class Students {
    int s_id;
    String s_name;
}