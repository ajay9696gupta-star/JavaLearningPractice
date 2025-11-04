package ex_23_Exceptions;

public class Lab191_Try_Catch {
    public static void main(String[] args) {
        String s1 = null;

        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println("Error, Trim not allowed for the null value");
        }


        // unchecked java.lang.NullPointerException


    }
}
