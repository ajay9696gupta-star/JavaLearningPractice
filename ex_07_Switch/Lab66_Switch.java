package ex_07_Switch;
import javax.xml.transform.Source;
import java.util.Scanner;
public class Lab66_Switch {
    public static void main(String[] args) {
        // You need to take a user input and ask for the integer from 1 to 7.
// And if user enters 1 to 7,
// you will tell which day it is.


// Logic Building Formula

// Step 1 - Number one is using the Scanner class.
// Step 2 - number two will be basically figuring out the expression and the day.
// Step 3 - We will basically add step 3 as a rough logic.
// Step 4 - is you will write the fix the logic and optimize.
// Step 5 - figure out the edge cases.

        //Step1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7");
        if (scanner.hasNext()){
            int day = scanner.nextInt();
            switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednessday");
                    break;
                case 4:
                    System.out.println("Thrusday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                default:
                    System.out.println("Enter  Number between 1 and 7 only, You Fool!");
            }


        }else{
            System.out.println("Enter int you FooL!");
        }

    }
}
