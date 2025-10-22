package ex_16_OPPs_Constructors;

public class Car2 {

    String model;
    int year;

    Car2(){
        model = "xxx";
        year = 1980;
        System.out.println("DC");
    }
    Car2(String model_name){
        this.model = model_name;
    }

    Car2(String model_name, int year_created){
        this("i10");
        this.model = model_name;
        this.year = year_created;
    }


}
