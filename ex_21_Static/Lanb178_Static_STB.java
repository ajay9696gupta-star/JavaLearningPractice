package ex_21_Static;

public class Lanb178_Static_STB {
    public static void main(String[] args) {
        A a = new A();
    }
}

class  A{
    static {
        System.out.println("Called only once when class is loaded");
        System.out.println("you cam write a code reading a excel,file,database file");
    }
    static int a = 10;
    static void m1(){
        System.out.println("Static function");
    }
}