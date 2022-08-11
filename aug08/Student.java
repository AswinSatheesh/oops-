import java.util.Scanner;
public class Student{
    public String name;
    private int marks;
    public Student(String stuname){ //constructor
        name = stuname;
    }
    public void stumarks(int smark){ //method for storing mark
        marks = smark;
    }
    public void printMarks(){  //method for printing mark and name
        System.out.println("Name : " + name);
        System.out.println("Mark : " + marks);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name1 :");
        String name1 =sc.nextLine();
        System.out.println("Enter name2");
        String name2 = sc.nextLine();
        Student stu1 = new Student(name1); //constructor value taken from the user and passed the variable here
        Student stu2 = new Student(name2);
        stu1.stumarks(99);
        stu2.stumarks(94);
        stu1.printMarks();
        stu2.printMarks();
    }
}