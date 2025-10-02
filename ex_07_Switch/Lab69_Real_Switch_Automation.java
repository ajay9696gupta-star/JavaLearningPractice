package ex_07_Switch;

import java.util.Scanner;

public class Lab69_Real_Switch_Automation {
    public static void main(String[] args) {

        // Web Automation
        // I will ask the user to give me the input from browser which he want to
        // use to I will start the automation in that browser

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();

        switch (browser){
            case "chrome":
                System.out.println("Starting  the chrome");
                System.out.println("...............");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "Firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;

        }
    }
}
