package ex_04_Ternary_Operator;

public class Lab47_To_Even_Odd {
    public static void main(String[] args) {
        //Step 1 -Input, Output -> data type
        int num =14;
          // Step 2 -> num%2 ==0 > even else 1 odd
        String result = (num%2 == 0) ? "even" : "odd";
        System.out.println(result);
    }

}
