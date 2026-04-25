import java.sql.*;

public class ProductInventory {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "root");

            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS product(" +
                    "pid INT PRIMARY KEY, pname VARCHAR(50), qty INT)");

            st.executeUpdate("INSERT INTO product VALUES (101, 'Pen', 5)");
            st.executeUpdate("INSERT INTO product VALUES (102, 'Notebook', 20)");
            st.executeUpdate("INSERT INTO product VALUES (103, 'Marker', 8)");

            System.out.println("Low stock products:");
            ResultSet rs = st.executeQuery("SELECT * FROM product WHERE qty < 10");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                        rs.getString(2) + " " + rs.getInt(3));
            }

            st.executeUpdate("UPDATE product SET qty = qty + 10 WHERE pid = 101");

            st.executeUpdate("DELETE FROM product WHERE pid = 103");

            System.out.println("Done");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}