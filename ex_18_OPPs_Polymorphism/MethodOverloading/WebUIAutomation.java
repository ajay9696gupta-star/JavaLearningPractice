package ex_18_OPPs_Polymorphism.MethodOverloading;

public class WebUIAutomation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.startBrowser();
        b1.startBrowser("Chrome");
        b1.startBrowser("Firefox");
    }
}

class Browser{
    void startBrowser(){
        System.out.println("Default browser is started");
    }
    void startBrowser(String browser){
        System.out.println("Starting browser "+browser);

    }

}
