import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class BLC_Management {
 public static void main(String[] args) {


     // for create file


  File dir=new File("oop project");
  dir.mkdir();
  File file1=new File("student.txt");
  File file2=new File("teacher.txt");

  try {
   file1.createNewFile();
   file2.createNewFile();
  }catch(Exception e) {
System.out.println(e);
  }

//for write into file

  try {
      Formatter formatter=new Formatter("student.txt");
formatter.format("%s %s\r\n","221-15-5317","Ayesha akter");
      formatter.format("%s %s\r\n","221-15-4555","lisa akter");
      formatter.close();
      Formatter formatter1=new Formatter("teacher.txt");
      formatter1.format("%s %s\r\n","677717"," sajid hossain");
      formatter1.format("%s %s\r\n","677885","rakib hossain");
      formatter1.close();
  }catch (FileNotFoundException e){
System.out.println(e);
  }

  //for read into file


  try {
      File file=new File("C:/Users/my pc/IdeaProjects/project/student.txt");
      Scanner scanner=new Scanner(file);
      while (scanner.hasNext()){
         String id=scanner.next();
          String name=scanner.next();
      }
      File file3=new File("C:/Users/my pc/IdeaProjects/teacher.txt");
      Scanner scanner2=new Scanner(file);
      while (scanner2.hasNext()){
          String id=scanner2.next();
          String name=scanner2.next();
      }
  }catch (Exception e){
      System.out.println(e);
  }
//for user input
  Scanner input=new Scanner(System.in);

  String username=input.nextLine();
  String password=input.next();
  Student student1 = new Student("@diu.edu.bd", "*****", "221-15-5317", "Ayrsha akter");
  Student student2 = new Student("@diu.edu.bd", "*****", "221-15-4798", "Sadid hossain");


  Faculty Faculty1 = new Faculty("cse@diu.edu.bd", "*****", "70001", "Nasima islam bithi");
  Faculty Faculty2 = new Faculty("cse@diu.edu.bd", "*****", "70002", "Assadujaman");


  Course course1 = new Course("cse214", "object oriented programming", Faculty1,student1);
  Course course2 = new Course("cse224", "data communication", Faculty2,student2);

  //for print

student1.logo();
student1.log_In();
System.out.println("username:"+username);
  System.out.println("password:"+password);
Faculty1.not_robot();
System.out.println("Log in");
  System.out.println("\n\n\n");
System.out.println("Course 1");
 course1.display();
 Faculty1.display();
 System.out.println("Student list");
 student1.display();
 student2.display();
  System.out.println("\n\n\n");
  System.out.println("Course 2");
  course2.display();
  Faculty2.display();
  System.out.println("Student list");
  student1.display();
  student2.display();
 }
         }