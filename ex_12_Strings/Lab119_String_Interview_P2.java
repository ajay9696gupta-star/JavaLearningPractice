package ex_12_Strings;

public class Lab119_String_Interview_P2 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello";


        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("Hello");

        // == -> Comparsion -> String => this check the ref location

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5);

        //equals (Content_ -> Value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));


    }
}
