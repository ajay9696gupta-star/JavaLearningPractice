package ex_12_Strings;

public class Lab123_StringExample1 {
    public static void main(String[] args) {
        String s= "java";
        char c = s.charAt(2);
        System.out.println(c);

        int result = "abc".compareTo("ABC");
        System.out.println(result);

        int idx = "Java".indexOf("a"); //1
        System.out.println(idx);

        int idx2 = "java".lastIndexOf("a"); //3
        System.out.println(idx2);

        boolean b = "".isEmpty();
        System.out.println(b);

        String s11 = String.join("-","java","Python");
        System.out.println(s11);

        String s12 = "Java".replace('a','o'); //"Jovo
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); // true
        System.out.println(b1);

        String s13 = "Java".concat("Mava");
        System.out.println(s13);



    }
}
