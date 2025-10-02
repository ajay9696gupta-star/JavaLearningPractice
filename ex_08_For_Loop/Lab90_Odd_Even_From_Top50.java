package ex_08_For_Loop;

public class Lab90_Odd_Even_From_Top50 {
    public static void main(String[] args) {
        // To find even number from 1 to 50
        for (int i = 1; i <=50 ; i++) {
            if(i % 2 == 0){
                // if(i % 2 != 0) for Odd
                System.out.println("Even -> " + i);
            }
            
        }
    }
}
