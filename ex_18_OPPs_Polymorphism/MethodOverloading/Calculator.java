package ex_18_OPPs_Polymorphism.MethodOverloading;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        scanner.nextInt();*/
        Calc c1 = new Calc();
      double result =  c1.add(3.45,4.64);
        c1.add(2,8);
        c1.add(2,4,8);
        System.out.println(result);


    }

}
class Calc{  // Same method name with different parmenter

    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    double add(double a,double b){
        return a+b;
    }

    long add(long a,long b){
        return a+b;
    }

        }