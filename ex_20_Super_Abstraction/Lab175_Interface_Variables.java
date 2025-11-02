package ex_20_Super_Abstraction;

public class Lab175_Interface_Variables {
    public static void main(String[] args) {

        Gupta ajay = new Gupta();
        ajay.display();
        Goc goc =new Goc();
        goc.practice();
        goc.teach();

        Sandeep sandeep = new Sandeep();
        sandeep.practice();
        sandeep.teach();

    }
}

interface ajay{
    int a =10; // interface variable are always Final
    void display();
}

class Gupta implements ajay{

    int aa = 12;
    @Override
    public void display() {
        System.out.println(a);
        System.out.println(this.aa);

    }
}

class Sandeep implements  TTA {

    @Override
    public void practice() {
        System.out.println("Do Practice sandeep");
    }

    @Override
    public void teach() {

        System.out.println("Take online class every Saturday & Sunday, Sandeep you have pay Attention");
    }
}

class Goc implements TTA{

    @Override
    public void practice() {
        System.out.println("Do Practice");
    }

    @Override
    public void teach() {
        System.out.println("Take online class every Saturday & Sunday");
    }
}

interface TTA{
    void practice();
    void teach();
}

