package ex_14_Arrays;

import java.util.Scanner;

public class Lab146_2D_Reverse_Left_Triangle {
    public static void main(String[] args) {
        // left hand triangle pattern
        // n = 3
        // *
        // **
        // ***

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n for the pattern, e.g n= 3");
        int n = scanner.nextInt();

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");


        }

    }
}
