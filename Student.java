

class Student extends LogIn {
    private String studentId;
    private String studentName;

//for set information
    public Student(String username, String password,  String studentId, String studentName) {
        super(username, password);
        this.studentId = studentId;
        this.studentName = studentName;

    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {

        return studentName;
    }

public void display(){

    System.out.println("studentId: " + getStudentId() + "  "+"studentName: " + getStudentName() );

}
}