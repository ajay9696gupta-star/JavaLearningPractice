package ex_17_OOPs_Part2.OPPs_01_inheritance.singleiheritance;

public class Lab157_SingleInheritance {
    public static void main(String[] args) {
        Son ajay = new Son();
        System.out.println(ajay.gold_f);
        ajay.bhk2();
        ajay.bhk3();

        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();
        //f1.bhk3(); Father can't use child property

    }

}
