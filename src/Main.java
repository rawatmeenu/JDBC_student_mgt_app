import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("-----WELCOME TO STUDENT MANAGEMENT APP----");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("PRESS 1 to ADD student");
            System.out.println("PRESS 2 to DELETE student");
            System.out.println("PRESS 3 to DISPLAY student");
            System.out.println("PRESS 4 to UPDATE student");
            System.out.println("PRESS 5 to EXIT");

            int c = Integer.parseInt(br.readLine());

            if(c==1)
            {
                System.out.println("enter user id");
                int id = Integer.parseInt(br.readLine());
                //add
                System.out.println("enter user name");
                String name = br.readLine();

                System.out.println("enter user phone");
                String phone = br.readLine();

                System.out.println("enter user city");
                String city = br.readLine();


                //create student obj to store student
                Student stud= new Student(id,name, phone, city);
                boolean answer = StudentDAO.insertStudenttoDAO(stud);
                if(answer == true)
                {
                    System.out.println("student added sucecsfuly");
                }
                else{
                    System.out.println("someting went wrong");
                }
                System.out.println(stud);


            }
            else if(c==2) {
                //delete

                System.out.println("enter userid to delete");
                int userId = Integer.parseInt(br.readLine());
                boolean ans = StudentDAO.deletestudent(userId);
                if (ans == true) {
                    System.out.println("user deleted");
                } else {
                    System.out.println("Try once again!");
                }
            }
            else if(c==3)
            {

                StudentDAO.displaystudents();
                //update
            }
            else if(c==4)
            {
                //Student studen= new Student(id,name, phone, city);
               // boolean answer = StudentDAO.insertStudenttoDAO(stud);
               // Student studen = new Student(id,name, phone,city);
                StudentDAO.updatestudent();
            }
            else if(c==5)
            {
                break;
            }
            else{

            }

        }

        System.out.println("THANKYOU FOR USING THE APP");


    }
}