package ex_03_TypeCasting;

public class Lab42_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total1 = course + GST; // Narrowing - Implicit
        int total =  course+(int)GST; // Narrowing - Explicit
        System.out.println(total);

        float total2 = course + GST;  // Widening -auto - Implicit
        //          float total2 =  (float)course + GST; //Widening - Explicit

        System.out.println(total2);

    }
}
