package ex_07_Switch;

public class Lab78_Interview {
    public static void main(String[] args) {
        char code = 'C';
        switch (code){
            default:
                System.out.println("Helloooooooooo");
            case 'A':  // A will also print because we didn't enter break after default
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }

    }
}
