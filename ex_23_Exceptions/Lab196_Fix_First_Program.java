package ex_23_Exceptions;

public class Lab196_Fix_First_Program {
    public static void main(String[] args) {
        try {
            String ip =  args[0]; // ArrayIndexOutOF
            int a = Integer.parseInt(ip); //java.lang.NumberFormatException
            int b = 100/a; //java.lang.ArithmeticException
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem");
        }
        finally {
            System.out.println("I will be always called");
        }

    }
}
