package ex_14_Arrays;

import java.util.Scanner;

public class Lab145_2D_Left_Triangle {
    public static void main(String[] args) {
        // left hand triangle pattern
        // n = 3
        // *
        // **
        // ***

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n for the pattern, e.g n= 3");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println("");
            
        }

    }
}
