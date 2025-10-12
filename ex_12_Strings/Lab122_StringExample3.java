package ex_12_Strings;

public class Lab122_StringExample3 {
    public static void main(String[] args) {

        String s =  "Sandeep".substring(3);
        System.out.println(s);

        String s1 = "Sandeep".substring(2,5);
        System.out.println(s1);

        char[] arr = "Sandeep".toCharArray();
        System.out.println(arr);

        String st = "   Ajay".trim();
        System.out.println(st);

        boolean b = "         ".isBlank();
        System.out.println(b);

        String s2 = "ab".repeat(4);
        System.out.println(s2);

        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11);



    }
}
