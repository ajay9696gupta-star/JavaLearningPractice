package ex_26_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab219_Nested_ArrayList {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList();
        fruits1.add("Mango");
        fruits1.add("Apple");
        fruits1.add("cherry");
        // fruits1.add(133);
        System.out.println(fruits1);

        List furits2 = new ArrayList();
        furits2.add("Orange");
        furits2.add("Grapes");
        furits2.add("papaya");
        System.out.println(furits2);

        List vegetables = new ArrayList();
        vegetables.add("tomato");
        vegetables.add("Patato");
        vegetables.add("Onion");
        System.out.println(vegetables);

        List all_furits_veg = new ArrayList();
        all_furits_veg.add(fruits1);
        all_furits_veg.add(furits2);
        all_furits_veg.add(vegetables);
        System.out.println(all_furits_veg);
        System.out.println(all_furits_veg.size());

        System.out.println(all_furits_veg.get(1));
    }
}
