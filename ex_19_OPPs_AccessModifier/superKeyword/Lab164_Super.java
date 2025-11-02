package ex_19_OPPs_AccessModifier.superKeyword;

public class Lab164_Super {


}
class BaseClass{
   private String browser;

    BaseClass(){
        System.out.println("DC Parent");

    }

    BaseClass(String browser){
        this.browser = browser;
        System.out.println("DC Parent");

    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    void openBrowser(){
        System.out.println("Opening Browser");
    }

    void openBrowser(String browserName){
        System.out.println("Open Browser -> " +browserName);
    }

    void  closeBrowser(){
        System.out.println("Close browser");
    }
}

class  TestCase extends BaseClass {

    void testc(){

    }
    TestCase(){
        //super();
        super("Chrome"); //PC
        super.openBrowser();
        super.openBrowser();
        super.closeBrowser();
        System.out.println(super.getBrowser());
        super.setBrowser("fireFox");
    }

}
