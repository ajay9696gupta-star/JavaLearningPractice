package ex_22_Wrapper_Class;

public class Lab187_Wrapper_Conversion {

    public static void main(String[] args) {
        String num = "10";
        int aa = 10;

        // String  -> Wrapper Conversion
        Integer a = Integer.parseInt(num);
        // Double.parseDouble()
      //  Float.parseFloat();
       // Long.parseLong()

        //String to primitive data type

       int a_p = Integer.parseInt(num);

       Integer aa3 = Integer.valueOf("15");
        System.out.println(aa3);



    }
}
