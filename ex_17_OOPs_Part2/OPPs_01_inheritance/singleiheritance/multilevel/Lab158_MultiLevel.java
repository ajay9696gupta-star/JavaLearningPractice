package ex_17_OOPs_Part2.OPPs_01_inheritance.singleiheritance.multilevel;

public class Lab158_MultiLevel {
    public static void main(String[] args) {
        Son ajay = new Son();
        ajay.home();
        ajay.bhk3();
        ajay.extra();
        ajay.gf();

        Father f = new Father();
        f.gf();
        f.home();
        f.extra();


        GrandFather gf = new GrandFather();
        gf.gf();
        gf.home();

        // Dynamic Dispatch

        GrandFather g1 = new Son();
        Father f1 = new Son();
       // Son s1 = new GrandFather();
        // Son s2 = new Father();





    }
}
