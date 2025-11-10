package ex_23_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab201_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream f = new FileInputStream("C:\\Program Files");
    }
}
