package ex_02_Operator;

public class Lab28_OR_AND_GATE {
    public static void main(String[] args) {
        // || OR Gate
        System.out.println(true || true); //true
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println(false || false);//false

        //And && // Only true and true  returns true

        System.out.println(true && true); //true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

    }
}
