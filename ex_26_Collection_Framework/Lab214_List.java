package ex_26_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab214_List {
    public static void main(String[] args) {
        List fruits = List.of("Orange","Apple","Guava","Mango","Watermelon");
        System.out.println(fruits);

        List arrayList =  new ArrayList();

        arrayList.add("Ajay");
        arrayList.add("Ajay");
        arrayList.add("Gupta");
        arrayList.add(true);
        arrayList.add(1.23);
        arrayList.add(123);
        System.out.println(arrayList.size());
        System.out.println(arrayList);

    }
}
