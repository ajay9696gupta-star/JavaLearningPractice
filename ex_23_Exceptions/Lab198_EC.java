package ex_23_Exceptions;

public class Lab198_EC {
    public static void main(String[] args) {
        try {
            String ip =  args[0]; // ArrayIndexOutOF
            int a = Integer.parseInt(ip); //java.lang.NumberFormatException
            int b = 100/a; //java.lang.ArithmeticException
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
