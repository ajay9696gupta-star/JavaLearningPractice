package ex_03_TypeCasting;

public class Lab40_TypeCating_Narrowing {
    public static void main(String[] args) {
         int val = 300;
      //   byte b = val; // Narrowing -  Implicit Casting  - Valid ? NOt Valid
         byte b = (byte) val; // Narrowing -  Explicit Casting  - Valid ? Yes 100% valid

    }
}
