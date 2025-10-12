package ex_14_Arrays;

public class Lab132_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int marks[] = {91,98,86,100,91,83,97};

        boolean [] is_married_people = {true,true,false};
        System.out.println(marks.length);

        System.out.println(marks[0]);
        System.out.println(marks[2]);
        //System.out.println(marks[-1]);

        String name = "Ajay";
        String[] name_each_element_char = name.split("");
        for (String s: name_each_element_char){
            System.out.println(s);
        }


    }
}
