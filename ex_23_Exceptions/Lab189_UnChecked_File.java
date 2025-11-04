package ex_23_Exceptions;

public class Lab189_UnChecked_File {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = b/a; //java.lang.ArithmeticException
        System.out.println(c);

        String name = null;
        name.trim();// ava.lang.NullPointerException

    }
}
