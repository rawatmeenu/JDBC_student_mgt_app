import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

    static Connection con;

    public static Connection createC(){


        try {
            //load the driver
            Class.forName("org.postgresql.Driver");

            //create the connection
            String URL = "jdbc:postgresql://localhost:5432/postgres";
            String usern = "postgres";
            String pw = "12345678";

            con= DriverManager.getConnection(URL, usern, pw);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }


}
