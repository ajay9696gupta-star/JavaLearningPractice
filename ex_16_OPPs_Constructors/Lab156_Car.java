package ex_16_OPPs_Constructors;

public class Lab156_Car {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();

        Car tesla = new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);
    }

}

