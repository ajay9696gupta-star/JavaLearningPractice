package ex_23_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab202_Try_Catch {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Program Files");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("yes");
        }
    }
}
