package ex_02_Operator;

public class Lab29_Interview_Question {
    public static void main(String[] args) {
        int balaji_Salary = 12;
        boolean b = !(balaji_Salary > 10 || balaji_Salary <5);
        System.out.println(b);

        // Divide and Conquer

        // A -> balaji_Salary > 10 --> 12 > 10 --> True
        // B -> balaji_Salary > 10 --> 12 > 10 --> False
        // (A || B) --> True
        // !(True) --> False
    }
}
