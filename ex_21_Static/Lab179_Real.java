package ex_21_Static;

public class Lab179_Real {
}

class ATB14x{

    {
        System.out.println("IIb - this is called when object is created!");
    }

    static {
        System.out.println("Load the class?, I will execute");
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void readDocument(){
        System.out.println("Non Static Method");
        System.out.println(courseName);
    }

    static void doAssignment(){
       // System.out.println(phone); Static method can't access the non Static
        System.out.println("Do Assignment");
    }

    private String name;
    private int phone;

    static String courseName = "ATB14x";

}
