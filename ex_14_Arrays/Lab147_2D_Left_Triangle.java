package ex_14_Arrays;

import java.util.Scanner;

public class Lab147_2D_Left_Triangle {
    public static void main(String[] args) {
        // left hand triangle pattern
        // n = 3
        //   *
        //  **
        // ***

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n for the pattern, e.g n= 3");
        int n = scanner.nextInt();*/

        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-1; j++) {
                System.out.print("-");

            }
            for (int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
            
        }

    }
}
