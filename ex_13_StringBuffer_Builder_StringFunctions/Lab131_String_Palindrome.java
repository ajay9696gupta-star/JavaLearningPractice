package ex_13_StringBuffer_Builder_StringFunctions;

public class Lab131_String_Palindrome {
    public static void main(String[] args) {
        // madam -> reverse -> madam
        // naman -> reverse -> naman
        // user_input == reverse(user_input)

        //String input = "madam";
        String input = "Ajay";
        String reversed = "";

        for (int i = input.length() - 1; i >=0 ; i--) {
            reversed = reversed + input.charAt(i);

        }
        if(reversed.equalsIgnoreCase(input)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }

    }
}
