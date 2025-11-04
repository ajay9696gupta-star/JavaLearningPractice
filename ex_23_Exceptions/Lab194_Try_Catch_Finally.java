package ex_23_Exceptions;

public class Lab194_Try_Catch_Finally {
    public static void main(String[] args) {
        int a = 1;
        int c = 0;

        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I will always Executed");
        }
        System.out.println(c);
    }
}
