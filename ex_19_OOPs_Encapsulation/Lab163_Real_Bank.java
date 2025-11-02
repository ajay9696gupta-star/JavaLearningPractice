package ex_19_OOPs_Encapsulation;

import ex_17_OOPs_Part2.OPPs_01_inheritance.singleiheritance.hierarchical.Ajay;

public class Lab163_Real_Bank {
    public static void main(String[] args) {
        ICICIBank ajay = new ICICIBank("Ajay",200);
       long bal = ajay.getBal();
        System.out.println(bal);
        // System.out.println(ajay.bal); can't possible private

        // Cashier is allowed to set the balance
        ICICIBank cachier = new ICICIBank("Cash",200);
        cachier.setBal(400,true);
        System.out.println(cachier.getBal());

    }
}

class ICICIBank{
    private String name;
    private  long bal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isCashier) {
        if(isCashier){
        this.bal = bal;
    } else {
            System.out.println("Don't have right to setBalance");
        }
    }

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;


    }
}