package ex_18_OPPs_Polymorphism.MethodOverriding;

public class Lab160_MethodOverriding {
    public static void main(String[] args) {

        // Runtime polymorphism
        Ajay a1 = new Ajay();
        a1.home();

        Father f1 = new Father();
        f1.home();

        Father f2 = new Ajay(); // Dynamic Dispatch Ajay class method will be called means Ajay class object is created so it will call Ajay class method
        f2.home();

       // Ajay a1 = new Father(); // Not Possible
    }
}

class Father{
    void home(){
        System.out.println("Father home 2BHK");
    }
}

class Ajay extends Father {
    @Override
    void home() {
        System.out.println(" 3BHK");
    }
}