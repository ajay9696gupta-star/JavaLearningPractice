package ex_26_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab223_AL_iteration {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();
        mylist.add("Ajay");
        mylist.add("Amit");
        mylist.add("Gupta");
        System.out.println("  - To Print ArrayList for each - ");

        for (String str : mylist){
            System.out.println(str);
        }

        System.out.println("  - To Print ArrayList of Iterator- ");

        Iterator<String> iterator  =  mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("  - To Print ArrayList of for- ");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));

        }


    }
}
