package ex_15_OOPs;

public class Lab152_Constratctor { // There can be only one public class
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Ajay");


    }
}


class Student {  // generally we avoid we should create seaprate class
    String name;

    // This is default constructor JVM created automatically
    Student(){
        System.out.println("DC -> Hi, I am called");
    }

    // Parameterized constructor
    Student(String name){
        System.out.println("PC -> Hi, " +name);
    }


    void sleep(){}
    void study(){}
    void eat(){}

}

