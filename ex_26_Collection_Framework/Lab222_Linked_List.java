package ex_26_Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab222_Linked_List {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        List mylist2 = new ArrayList(10);
        List mylits3 = List.of("12","23");

        List mylist4 = new LinkedList();
        mylist4.add(1);
        mylist4.add(2);
        mylist4.add(3);
        mylist4.add(4);
        mylist4.add(4);
        System.out.println(mylist4);


    }
}
