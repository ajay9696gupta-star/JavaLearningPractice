package ex_11_Functions;

import java.util.Scanner;

public class Lab108_User_Defined_one {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a");
        int a = scanner.nextInt();
        System.out.println("Enter the b");

        int b = scanner.nextInt();

        int result = sum_of_two_number(3,4);
        System.out.println(result);

        int result_2 = sum_of_two_number(10,45);
        System.out.println(result_2);

        int result_3 = sum_of_two_number(55,45);
        System.out.println(result_3);

        sum_of_two_number();
    }

    static int sum_of_two_number(int a,int b) {
        return a + b;
    }
    static void sum_of_two_number(){
        System.out.println("Hi, there, non return data type");
    }

}