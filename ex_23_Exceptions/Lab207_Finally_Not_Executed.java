package ex_23_Exceptions;

public class Lab207_Finally_Not_Executed {
    public static void main(String[] args) {
        try {
            int a = 10/10;
            System.out.println("Try Executed");
            // System.exit(0); JVM process kill
        } catch (Exception e) {
            System.out.println("Catching the Exception");
        } finally {
            System.out.println("I will be always executed");
        }
    }

}
