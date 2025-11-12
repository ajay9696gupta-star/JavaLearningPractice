package ex_26_Collection_Framework;

import java.util.Stack;

public class Lab225_Stack {
    public static void main(String[] args) {
        Stack s1 = new Stack();

        // Last In and First Out

        Stack s = new Stack();
        s.add("Ajay");
        s.add("Vijay");
        s.add("Sandeep");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.add("Pradeep"));
        System.out.println(s);

        s.add("Chetan");
        s.add("Chetan"); // Duplicate Allowed
        s.add("Aanya");
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(1));
    }
}
