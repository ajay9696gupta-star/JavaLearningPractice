package ex_18_OPPs_Polymorphism.MethodOverloading;

public class Lab159_Real_MOverLoading {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task();
        h1.task("Clean Bathroom");
    }
}

class Home{
    void task(){
        System.out.println("Task Cleaning Fan");
    }
    void task(String whichTask){
        System.out.println("Task "+whichTask);
    }
}