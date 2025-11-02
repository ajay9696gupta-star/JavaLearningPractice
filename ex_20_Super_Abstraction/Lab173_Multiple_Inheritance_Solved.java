package ex_20_Super_Abstraction;

public class Lab173_Multiple_Inheritance_Solved {
    public static void main(String[] args) {
        Child child = new Child();
        child.money();
    }
}

class Child implements Father1,Father2{

    @Override
    public void money() {
        System.out.println("Child Money!");
    }
}

interface Father1{
    void money();
}
interface Father2{
    void money();
}