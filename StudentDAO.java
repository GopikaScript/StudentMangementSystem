import java.sql.*;
import java.util.*;

public class StudentDAO {
    public static void addStudent(String name, String email, String course) {
        Connection con = DBConnection.getConnection();
        try {
            String query = "INSERT INTO students (name, email, course) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, course);
            ps.executeUpdate();
            System.out.println("Student added successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void viewStudents() {
        Connection con = DBConnection.getConnection();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                Student s = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("course"));
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudent(int id) {
        Connection con = DBConnection.getConnection();
        try {
            String query = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            int result = ps.executeUpdate();
            if (result > 0)
                System.out.println("Student deleted successfully.");
            else
                System.out.println("Student not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

