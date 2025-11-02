package ex_20_Super_Abstraction;

public class Lab168_Private {
    public static void main(String[] args) {
        CAB cab = new CAB();
        cab.display();
    }
}
class XYZ{
    XYZ(){

    }
    protected int my_gold = 10;
}
class CAB extends XYZ{
    void display(){
        int gold = super.my_gold;
        System.out.println(gold);
    }
}
