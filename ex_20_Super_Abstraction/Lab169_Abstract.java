package ex_20_Super_Abstraction;

public class Lab169_Abstract {
    public static void main(String[] args) {

        Son s1 = new Son();
        s1.loan50k();
        s1.loan10k();

    }
}

abstract class AmitFather{
   abstract void loan50k();
     void loan10k(){
         System.out.println("Given");

     }
}

class Son extends AmitFather{
    @Override
    void loan50k(){
        System.out.println("OK, I am Amit, I will give the father Loan of 50k");
    }

}