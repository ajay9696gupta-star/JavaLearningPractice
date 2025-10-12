package ex_14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab137_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of array(int)");
        int size = scanner.nextInt();

        String[] number_marks = new String[size];

        for (int i = 0; i < number_marks.length; i++) {
            System.out.println("Enter the elements -> "+i);
            number_marks[i] = scanner.next();

        }

        System.out.println("------print the values");

        Arrays.sort(number_marks);

        for (String marks: number_marks){
            System.out.println(marks);
        }


    }
}
