import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uName = "postgres";
        String pass = "0000";
        String sql = "select * from student";

        //no need to load the driver anymore it is done by default
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url, uName, pass);
        System.out.println("Connection Established by DriverManager Object");

        Statement st = con.createStatement();
        System.out.println("Statement created by Connection object");

        ResultSet rs = st.executeQuery(sql);
        System.out.println("Statement Executed by Statement object");

//        when we were getting the sname only and one row
//        System.out.println(rs.next());
//        System.out.println("Storing the returned data in a var");
//        String name = rs.getString("sname");
//        System.out.println("Data: "+ "{ Name: " + name + " }");

//      if we get more than one row
        System.out.println("Looping on multi rows data");
        while (rs.next()) {
            System.out.print(rs.getString(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.println(rs.getString(3));
        }

        con.close();
        System.out.println("Connection is closed by Connection Object");

    }
}