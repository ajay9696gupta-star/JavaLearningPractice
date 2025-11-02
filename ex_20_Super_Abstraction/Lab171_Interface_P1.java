package ex_20_Super_Abstraction;

public class Lab171_Interface_P1 {
    public static void main(String[] args) {
        Car2 car2 = new Car2();
        car2.drive();
    }
}

class Car2 implements Breaks,Engine1{

    void  drive(){
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");

    }
}
interface Breaks{
    void applyBreak();
}

interface Engine1{
    void startEngine();
    void stopEngine();

    default void testEngine(){
        System.out.println("Concrete Complete");
    }

    default void testEngine1(){
        System.out.println("Concrete Complete11111");
    }


}