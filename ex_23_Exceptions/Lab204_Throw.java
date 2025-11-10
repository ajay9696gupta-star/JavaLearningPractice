package ex_23_Exceptions;

import java.util.Scanner;

public class Lab204_Throw {
    public static void main(String[] args) throws CustomException {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.next().equalsIgnoreCase("Ajay")){
            //throw new CustomException("Bag yaha se not allowed!");
            throw new ArithmeticException("hehehehe");
        }

        new Object();


    }
}
