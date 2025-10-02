package ex_03_TypeCasting;

public class Lab39_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid Syntax -> Widening -> Implicit Casting -> Automatically done by JVM
        int a1 = (int) b; // Valid Syntax -> Widening -> Explicit Casting -> Not required

    }
}
