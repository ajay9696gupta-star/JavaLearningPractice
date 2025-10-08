package ex_11_Functions;

public class Lab109_UD_Part1 {
    public static void main(String[] args) {
        // User Defined Functions.

      // 1. Without Parameters and Without Return Type
      // 2. Without Parameters but With Return Type
      // 3. With Parameters and Without Return Type
      // 4. With Parameters and With Return Type

        wop_wor_greet(); // calling 1st function

        String msg = wop_wor_greet_2(); // calling 2nd function
        System.out.println(msg);

        greet_with_details("Ajay",36,95000); // calling 3rd function
        greet_with_details("Keshav",42,105000);


        int sum1 = sum_of_two_number(2,4); // calling 4th function
        int sum2 = sum_of_three_number(45,68,28);
        float sum3 = sum_of_three_number_float(25.5F,85.3f,28.6f);

        System.out.println("Sum of two number " +sum1);
        System.out.println("Sum of Three number " +sum2);
        System.out.println("Sum of float number " +sum3);




    }
    // 1. Without parameters and without return type, (Declare) / Define

    static void wop_wor_greet(){
        System.out.println("Hi, there!!");
    }

    // 2. Without parameters and with return type

    static  String wop_wor_greet_2(){
        System.out.println("Hi, Type 2 function!!");
        return "Hi, How are you!";
    }

    // 3. With Parameters and Without Return Type

    static void greet_with_details(String name, int age, double salary){
        System.out.println("Your name is -> " +name+ "\nYour age is ->" +age+ "\nYour  Salary is ->" +salary);

    }

    // 4. With Parameters and With Return Type

    static int sum_of_two_number(int a, int b){
        return a+b;
    }
    static int sum_of_three_number(int a,int b,int c){
        return a+b+c;
    }
    static float sum_of_three_number_float(float a,float b,float c){
        return a+b+c;
    }




}
