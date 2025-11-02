package ex_19_OPPs_AccessModifier.superKeyword;

public class Lab165_Super {
    public static void main(String[] args) {

       Son ajay = new Son();
       int gold_c = ajay.gold_c;
        System.out.println(gold_c);
       ajay.home();
       ajay.newHome();


    }
}
class Father{
    Father(){
        System.out.println("DC Father");
    }

    int gold = 10;

    void home(){
        System.out.println("Home Father");
    }
}

class Son extends Father {
    Son(){
        super();
    }

    int gold_c =100;

    void bike(){
        System.out.println("This is my Bike");
    }

    void newHome(){
        System.out.println(super.gold);
        super.home(); // call father home(method) by using super keyword(super is use for father class)
        this.bike(); // call own method by using this keyword (This is user for current class)
        System.out.println(this.gold_c);

    }
}
