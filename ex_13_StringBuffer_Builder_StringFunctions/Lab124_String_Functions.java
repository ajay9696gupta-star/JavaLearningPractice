package ex_13_StringBuffer_Builder_StringFunctions;

public class Lab124_String_Functions {
    public static void main(String[] args) {
        String name = "Vijay";

        System.out.println(name.length());
        System.out.println(name.charAt(3));

        System.out.println(name.concat(" Gupta"));

        System.out.println(name.contains("ay"));

        System.out.println(name.equals("vijay"));

        System.out.println(name.equalsIgnoreCase("VIJAY"));

        System.out.println(name.indexOf('j'));

        System.out.println(name.indexOf('V'));

        StringBuilder stringbuilder = new StringBuilder("Sandeep");
        System.out.println(stringbuilder);
        stringbuilder.reverse();
        System.out.println(stringbuilder); // Stringbuilder is mutable only one string exist


    }
}
