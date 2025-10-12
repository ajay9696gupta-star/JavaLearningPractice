package ex_14_Arrays;

import java.util.Arrays;

public class Lab136_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
           // logic

        /*Arrays.sort(array);
        System.out.println(array[array.length-1]);*/
        
        int max =  array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
            
        }
        System.out.println("Maximum value is "+max);

        int min =  array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                max = array[i];
            }



        }
        System.out.println("Minimum value is : "+min);

        

    }
}
