package ex_04_Ternary_Operator;

public class Lab48_To_Three_Max {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        //LBF > Logic Building Formula

        // Step 1 -> Find the inputs and output data type
        // I/O -> n1,n2,n3 --> int
       // O/p -> int - Max number  or String we can message with max number

        //Step 2 - Rough Locic, Think about it.
        // n1 > n2 && n1 > n3 -> n1
        // n2 > n3 && n2 > n1 -> n2
        // n3

        // Step 3 - Dry Run  -Program
                              // Expression 1          // Expression2
        int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);

        System.out.printf("Max is %d",max);



    }
}
