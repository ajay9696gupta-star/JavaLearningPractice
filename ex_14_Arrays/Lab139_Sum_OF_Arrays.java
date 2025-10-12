package ex_14_Arrays;

public class Lab139_Sum_OF_Arrays {
    public static void main(String[] args) {
        int[] number = {12, 34, 10};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum+ number[i];

        }
        System.out.println("Add all the number -> "+sum);

    }
}
