package ex_11_Functions;

import java.util.Scanner;

public class Lab111_Funtion_Arth {
    public static void main(String[] args) {

        // Create a Function of Sub, Sum, Mul and Div
// with parameter, a, b (take the parameter from the User)

// Logic Building
// Step 1 -> Inputs and Outputs
// a, b - int -> Scanner
// int -> variable result ->

// Step 2 - Rough logic -> Create functions
// function -> type 4th - with return and with arguments/parameters

  // Step 3 - Write the code and Find and fix --> Edge cases

        Scanner scanner = new Scanner(System.in);

        int a = readInt(scanner, "Enter the num1: ");
        int b =  readInt(scanner,"Enter the num2: ");

        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);


    }
    static int readInt(Scanner scanner, String prompt){
        System.out.println(prompt);
        if(scanner.hasNext()){
            return scanner.nextInt();
        }else {
            System.out.println("Enter the Int only.");
            System.exit(0);
            return 0;
        }
    }

    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }

    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Division by Zero is not allowed");
        }
        return a/b;
    }
}
