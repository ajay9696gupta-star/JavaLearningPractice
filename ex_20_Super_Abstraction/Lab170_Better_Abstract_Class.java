package ex_20_Super_Abstraction;

public class Lab170_Better_Abstract_Class {

    public static void main(String[] args) {
        Alto alto = new Alto();
        alto.drive();
        alto.rubberTyer();
        alto.blacColorDoToTyer();
        alto.startEngine();
        alto.startCar();
        alto.changeGear();
        alto.stopCar();

    }

}

abstract class Car1{
    abstract void startCar();
    abstract void stopCar();
}

class Alto extends Car1 implements Tyer,Gear,Engine{

    void drive(){
        this.startCar();
        rubberTyer();
        blacColorDoToTyer();
        changeGear();
        this.stopCar();
    }

    @Override
    void startCar() {
        System.out.println("Starting the Car");

    }

    @Override
    void stopCar() {
        System.out.println("Stoping the Car");

    }

    @Override
    public void changeGear() {
        System.out.println("Change Gear");
    }

    @Override
    public void rubberTyer() {
        System.out.println("Rubber tyer");

    }

    @Override
    public void blacColorDoToTyer() {
        System.out.println("Black color tyre");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Engine");
    }
}

interface Tyer{
  abstract void rubberTyer();
    void blacColorDoToTyer();
}

interface Gear{
    void changeGear();
}

interface Engine{
    void startEngine();
}