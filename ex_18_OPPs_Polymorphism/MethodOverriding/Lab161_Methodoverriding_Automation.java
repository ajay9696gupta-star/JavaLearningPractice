package ex_18_OPPs_Polymorphism.MethodOverriding;

import ex_16_OPPs_Constructors.Car;

public class Lab161_Methodoverriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        FirefoxTC f1 = new FirefoxTC();
        f1.openBrowser();

        CommonToAll c2 = new CommonToAll();
                c2.openBrowser();

                //Dynamic Dispatch

        CommonToAll c3 = new ChromeTC();
        c3.openBrowser();

        CommonToAll c4 = new FirefoxTC();
        c4.openBrowser();
    }
}

class CommonToAll{
    void openBrowser(){
        System.out.println("Starting the IE Browser");
    }
}

class ChromeTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting Chrome, Better browser");
    }
}

class FirefoxTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting Firefox, Better browser");
    }
}
