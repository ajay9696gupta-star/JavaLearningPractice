package ex_22_ENUM;

public class Lab183_Enum {
    public static void main(String[] args) {
        System.out.println(Environment.PROD.getBaseUrl());
        System.out.println(Environment.DEV.getBaseUrl());
        System.out.println(Environment.STAGING.getBaseUrl());
    }

}

enum Environment {
    DEV("https://dev.myapp.com"),
    STAGING("https://staging.myapp.com"),
    PROD("https://myapp.com");

    private final String baseUrl;

    Environment(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}