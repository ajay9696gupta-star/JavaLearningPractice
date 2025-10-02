package ex_04_Ternary_Operator;

public class Lab45_Interview_Ready_Question {
    public static void main(String[] args) {
        int age = 21;

        //Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        String result = (age > 18) ? (age >25 ? "you can drink" : "you can goto goa but can't drink") : "No";
        System.out.println(result);
    }
}
