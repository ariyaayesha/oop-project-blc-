
public class Faculty  extends LogIn {

    private String facultyId;
    private String facultyName;

//for set information
    public Faculty(String username, String password, String facultyId,String facultyName) {
        super(username, password);
        this.facultyId = facultyId;
        this.facultyName=facultyName;

    }
    public String getFacultyId() {
        return facultyId;
    }
    public String getFacultyName() {
        return facultyName;
    }


    public void display(){

        System.out.println("facultyId: " + facultyId);
        System.out.println("facultyName: " + facultyName);
    }
}
