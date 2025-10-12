package ex_13_StringBuffer_Builder_StringFunctions;

public class Lab129_SB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" programming");
        System.out.println(sb);

        sb.replace(0,4,"C++");
        System.out.println(sb);
    }
}
