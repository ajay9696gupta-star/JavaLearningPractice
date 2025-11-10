package ex_25_Generics;

public class Lab210_Generics_Part1 {
    public static void main(String[] args) {
        temp_sum(10,10);
        temp_sum(10.34, 10.45);
        System.out.println(temp_sum("Ajay", "Gupta"));


    }

    /*static  Integer temp_sum(Integer a, Integer b){
        return a+b;
    }

    static  Double temp_sum(Integer a, Integer b){
        return a+b;
    }*/

    static <T> T temp_sum(T a, T b){
        return null;
    }


 }

