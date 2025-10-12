package ex_13_StringBuffer_Builder_StringFunctions;

public class Lab125_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%

        String s0 = "Ajay";
        String s1 = new String("Ajay");

        // less than <10% we use String builder and bufer

        StringBuilder stringBuilder = new StringBuilder("Ajay"); // buillder is not a thread safer
        StringBuffer stringBuffer = new StringBuffer("Ajay"); //buffer is thread safe

    }
}
