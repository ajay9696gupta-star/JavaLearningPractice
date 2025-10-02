package ex_03_TypeCasting;

public class Lab41_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 9713519696l;
        //short s = phone_no; // Narrowing  - implicit
        short s =(short) phone_no; // Narrowing  - Explicit
        System.out.println(phone_no);
    }
}
