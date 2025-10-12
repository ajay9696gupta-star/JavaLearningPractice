package ex_13_StringBuffer_Builder_StringFunctions;

public class Lab126_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer =  new StringBuffer("Ajay");
        stringBuffer.append(" Gupta");
        System.out.println(stringBuffer);

        String s1 =  "Ajay";
        s1 = s1+ "Gupta";
        System.out.println(s1);

    }
}
