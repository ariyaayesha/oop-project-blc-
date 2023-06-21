

class Course {
    private String courseId;
    private String courseName;
    private Faculty Faculty;
    private Student student;

//for set information
    public Course(String courseId, String courseName, Faculty Faculty,Student student) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.Faculty =  Faculty;
         this.student=student;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }



    public void display(){

        System.out.println("courseId: " + getCourseId());
        System.out.println("courseName: " +getCourseName());
    }
}