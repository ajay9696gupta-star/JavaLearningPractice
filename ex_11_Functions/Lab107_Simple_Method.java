package ex_11_Functions;

public class Lab107_Simple_Method {
    public static void main(String[] args) {

        non_return_type_function();

        String name = return_type_function();
        System.out.println(name);

        int num = return_type_function_int_();
        System.out.println(num);

    }
    static void non_return_type_function(){
        System.out.println("Hi, No Return function!");
    }

    // Return type -  which return a data type (int,string,char,boolean and float)
    static String return_type_function(){
        System.out.println("Hi, there, I will return something ");
        return "Ajay";
    }

    static int return_type_function_int_(){
        System.out.println("Hi, there, I will return something ");
        return 10;
    }


}
