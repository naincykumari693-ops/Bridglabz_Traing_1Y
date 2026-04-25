import java.sql.*;

public class EmployeeManager {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "root");

            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS employee(" +
                    "id INT PRIMARY KEY, name VARCHAR(50), salary DOUBLE)");

            st.executeUpdate("INSERT INTO employee VALUES (1, 'Aman', 25000)");
            st.executeUpdate("INSERT INTO employee VALUES (2, 'Riya', 35000)");
            st.executeUpdate("INSERT INTO employee VALUES (3, 'John', 15000)");

            System.out.println("Employees with salary > 30000:");
            ResultSet rs = st.executeQuery("SELECT * FROM employee WHERE salary > 30000");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                        rs.getString(2) + " " + rs.getDouble(3));
            }

            st.executeUpdate("UPDATE employee SET salary = salary * 1.10");

            st.executeUpdate("DELETE FROM employee WHERE salary < 15000");

            System.out.println("Done");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}