package ex_05_Increment_Decrement_Operator;

public class Lab52_Post_ID {
    public static void main(String[] args) {

       /* int a =10;
        System.out.println(++a);*/

        // Post Increment =  print first and then increase

        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);

        // ERT (Exp and Result Table)
// LNo | a_post |   b
// 11  |   10   |  NA
// 12  |   11   |  10
// 14  |   11   |  10

    }
}
