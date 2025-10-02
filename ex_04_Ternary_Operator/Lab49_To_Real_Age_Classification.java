package ex_04_Ternary_Operator;

public class Lab49_To_Real_Age_Classification {
    public static void main(String[] args) {

        /*String up1 = args[0]; // 12
        String up2 = args[1]; //14
        String up3 = args[2]; // 16

        System.out.println(up1);
        System.out.println(up2);
        System.out.println(up3);*/

          String user_input = args[0]; //68
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

        //Input - String
        // String - Int

        int age = Integer.parseInt(user_input);

        String result = (age < 18) ? "Minor" : (age <= 60) ? "Adult" : "Sr. Citizen";
        System.out.println(result);






    }
}
