package ex_18_OPPs_Polymorphism.MethodOverloading;

public class Lab158_Ploy_MethodOverLoading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r1 = m1.add(57,45);
        int r2 = m1.add(5,8,15);
        double r3 = m1.add(41.6,45.7);
        String r4 = m1.add("Ajay ", "Gupta");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }
}

class MathOperations {
    // In same class, When you have a method with same name
    // Same name method but different argument and different return type

    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    String add(String a,String b){
        return a+b;
    }
}
