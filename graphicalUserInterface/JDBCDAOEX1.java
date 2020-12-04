package graphicalUserInterface;

import java.sql.*;

public class JDBCDAOEX1 {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Student s1 = dao.getStudent(1);
        System.out.println(s1.s_name);
    }
}

class StudentDAO {
    public Student getStudent(int id) {
        Student s = new Student();
        s.s_id = id;
        try {
            String query = "select s_name from student where s_id = "+ id;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhms", "root", "abcd");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name = rs.getString(1);
            s.s_name = name;
            return s;
        } catch (ClassNotFoundException cnfex) {
            System.out.println(cnfex);
            cnfex.printStackTrace();
        } catch (SQLException sqlex) {
            System.out.println(sqlex);
            sqlex.printStackTrace();
        }
        return null;
    }
}

class Student {
    int s_id;
    String s_name;
}