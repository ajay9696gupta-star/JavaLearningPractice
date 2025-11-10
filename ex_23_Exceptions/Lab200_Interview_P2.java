package ex_23_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab200_Interview_P2 {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("C:\\Program Files");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
