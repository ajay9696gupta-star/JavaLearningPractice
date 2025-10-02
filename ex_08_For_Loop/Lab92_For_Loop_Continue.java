package ex_08_For_Loop;

public class Lab92_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if(i == 5){
                continue;
            }
            System.out.println(i); // 0,1,2,3,4,6,7
        }
    }
}
