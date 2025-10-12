package ex_13_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Lab130_Program {
    public static void main(String[] args) {
        // write a program to reverse a String without using inbuilt function

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input, i will reverse it");
        String user_input = scanner.next();

        /*StringBuilder stringBuilder = new StringBuilder(user_input);
        System.out.println(stringBuilder.reverse());*/

        // Ajay -> User_input.length(), charAt()
        String reverse_user_input = "";

        for (int i = user_input.length() - 1; i >=0; i--) {
            reverse_user_input = reverse_user_input + reverse_user_input.charAt(i);


        }
        System.out.println(reverse_user_input);


    }
}
