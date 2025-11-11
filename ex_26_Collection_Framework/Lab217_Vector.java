package ex_26_Collection_Framework;

import java.util.Vector;

public class Lab217_Vector {
    public static void main(String[] args) {
        Vector v = new Vector(); // Same as ArrayList
        v.add("Ajay");  // Nowadays Vector is outdated because it is to slow due to thread safe
        v.add("Ajay");
        v.add("Gupta");
        v.add(true);
        v.add(1.23);
        v.add(123);
        System.out.println(v.size());
        System.out.println(v);

    }
}
