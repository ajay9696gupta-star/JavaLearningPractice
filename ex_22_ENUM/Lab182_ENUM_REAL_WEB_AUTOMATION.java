package ex_22_ENUM;

public class Lab182_ENUM_REAL_WEB_AUTOMATION {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_userName.getLocator());
        System.out.println(Locators.page_input_password.getLocator());
        System.out.println(Locators.page_button.getLocator());
    }
}

enum Locators{
    page_input_userName("//*[@id=\"username\"]"),
    page_input_password("//*[@id=\"password\"]"),
    page_button("/html/body/div[3]/div/main/div/div[1]/div/div/div[1]/form/div[3]/div/button/span/span");

    private String locator;
    Locators(String locator){
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }
}