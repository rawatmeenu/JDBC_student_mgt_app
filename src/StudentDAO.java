import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO {

    public static boolean insertStudenttoDAO(Student st){

        boolean f = false;

        //jdbc code

        try{
            Connection conn = CP.createC();
            String q = "insert into students(studentId,studentname, studentphone, studentcity) values(?,?,?,?)";

            //preparedstatemnt
            PreparedStatement pstmt = conn.prepareStatement(q);

            //set the values
            pstmt.setInt(1,st.getStudnetId());
            pstmt.setString(2,st.getStudentName());
            pstmt.setString(3,st.getStudentPhone());
            pstmt.setString(4,st.getStudentCity());

            //execute
            pstmt.executeUpdate();
            f=true;
        }

        catch(Exception e)
        {
            e.printStackTrace();;
        }

        return f;






    }

    public static boolean deletestudent(int userId) {

        boolean f = false;

        //jdbc code

        try{
            Connection conn = CP.createC();
            String q = "delete from students where studentId = ?";

            //preparedstatemnt
            PreparedStatement pstmt = conn.prepareStatement(q);

            //set the values
            pstmt.setInt(1,userId);

            //execute
            pstmt.executeUpdate();
            f=true;
        }

        catch(Exception e)
        {
            e.printStackTrace();;
        }

        return f;

    }

    public static void displaystudents() {
        //boolean f = false;

        //jdbc code

        try{
            Connection conn = CP.createC();
            String q = "select *  from students";

            //createstatement
            Statement stmt = conn.createStatement();

           // stmt.execute();
            //execute

            //resultset
            ResultSet set = stmt.executeQuery(q);

            while(set.next())
            {
                int id = set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString(4);
                System.out.println("ID" + id);
                System.out.println("NAME" + name);
                System.out.println("PHONE" + phone);
                System.out.println("CITY" + city);
                System.out.println("++++++++++++++++++++++");

            }
        }

        catch(Exception e)
        {
            e.printStackTrace();;
        }
    }

    public static boolean updatestudent() {
        boolean flag = false;

        try{
            Connection conn = CP.createC();
            String q = "update students SET studentname= ? WHERE studentphone = ?";

            //preparedstatemnt
            PreparedStatement pstmt = conn.prepareStatement(q);

            //set the values
            pstmt.setString(1,"RITIKA");
            pstmt.setString(2,"jbs");


            //execute
            pstmt.executeUpdate();
            flag=true;
        }

        catch(Exception e)
        {
            e.printStackTrace();;
        }

        return flag;


    }
}
