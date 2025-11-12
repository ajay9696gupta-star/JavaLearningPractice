package ex_26_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab226_ArrayList_Class_Element {
    public static void main(String[] args) {

        Student s1 = new Student("1","Ajay");
        Student s2 = new Student("2","vijay");
        Student s3 = new Student("3","sandeep");

        List<Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}

class Student extends Object{
   private String name;
    private String rollNo;

    public Student(String rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void printDetails(){
        System.out.println("Student name: " +this.name);
        System.out.println("Student Roll no: " +this.rollNo);
    }
}
