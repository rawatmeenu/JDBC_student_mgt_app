public class Student {
    private int studnetId;
    private String studentName;
    private String StudentPhone;
    private String studentCity;

    public Student(int studnetId, String studentName, String studentPhone, String studentCity) {
        this.studnetId = studnetId;
        this.studentName = studentName;
        StudentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student(String studentName, String studentPhone, String studentCity) {
        this.studentName = studentName;
        StudentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student() {
        super();
    }

    public int getStudnetId() {
        return studnetId;
    }

    public void setStudnetId(int studnetId) {
        this.studnetId = studnetId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return StudentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        StudentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studnetId=" + studnetId +
                ", studentName='" + studentName + '\'' +
                ", StudentPhone='" + StudentPhone + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
