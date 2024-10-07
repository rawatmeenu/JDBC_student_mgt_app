//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class dbconn {
//
//    public static void main(String args[]) throws SQLException {
//        {
//            String URL = "jdbc:postgresql://localhost:5432/postgres";
//            String usern = "postgres";
//            String pw = "12345678";
//
//            Connection conn = DriverManager.getConnection(URL, usern, pw);
//
//            if (conn != null) {
//                System.out.println("Connected to the postgres database!");
//            } else {
//                System.out.println("Failed to make connection!");
//            }
//        }
//    }
//}
