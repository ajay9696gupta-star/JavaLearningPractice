package ex_20_Super_Abstraction;

public class Lab166 {
    public static void main(String[] args) {
        //Car
        Car tesla = new Car(300);
        tesla.drive();
    }

}

class Vehicle{
    public int maxSpeed = 180;

    void noTest(){
        System.out.println("Empty!");
    }
    Vehicle(){
        System.out.println("Default Const..");
    }
    Vehicle(int a){
        System.out.println("Parameter const.");
    }
    Vehicle(int a,int b){
        System.out.println("Parameter const.");
    }
    // Method Overloading - Same name function with different argument
    void message(){
        System.out.println("No Return, No Argument");
    }
    void message(int a){
        System.out.println("PC - argument");
    }
     void drive(){
         System.out.println("vehicle parent");
     }


}

class Car extends Vehicle{
    private int maxSpeed = 280;
    Car(){
        super(100);

        }
       Car(int a){
           System.out.println("PC Car");
    }
    void test(){

    }
    @Override
    void message(){
        super.message();
    }
    @Override
    void drive(){
        System.out.println("Over ridden the Vehicle");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();
    }


}
