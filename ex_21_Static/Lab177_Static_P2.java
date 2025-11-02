package ex_21_Static;

public class Lab177_Static_P2 {
    public static void main(String[] args) {
        ATB atb =new ATB();
        atb.display();
       // markAttendance();

    }

}


class ATB{
    int phone_np; // instance variable
    String name;

    static String course_name = "ATB"; // Static variable

    static void markAttendance(){
        System.out.println("Mark Attendance");
       // System.out.println(this.phone_np);
    }
    void display(){
        System.out.println(this.phone_np + this.name + course_name);
    }
}
