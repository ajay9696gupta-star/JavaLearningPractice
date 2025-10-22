package ex_16_OPPs_Constructors;

public class Lab154_OPPs {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        new Baby();
        Baby b2;
        //System.out.println(b2.name);
    }
}

class Baby{
    String name;

    //Default Constructor also called
    Baby(){
        System.out.println("I am called, Object is created");
    }
}
