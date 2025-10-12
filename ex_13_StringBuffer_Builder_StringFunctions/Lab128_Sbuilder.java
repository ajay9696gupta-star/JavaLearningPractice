package ex_13_StringBuffer_Builder_StringFunctions;

public class Lab128_Sbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");
        sb.reverse();
        System.out.println(sb);

    }
}
