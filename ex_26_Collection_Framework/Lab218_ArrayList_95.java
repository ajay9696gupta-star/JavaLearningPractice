package ex_26_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab218_ArrayList_95 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("bread");
        list.add("milk");
        list.add("butter");
        list.add("paneer");
        list.add("jam");
        list.add("cheeze");
        list.add(123);
        list.add(true);
        list.add(3.14);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("1"));

        System.out.println("--------------- ");

        for (Object o: list){
            System.out.println(o);
        }

    }


}
