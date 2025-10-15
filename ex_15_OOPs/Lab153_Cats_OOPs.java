package ex_15_OOPs;

public class Lab153_Cats_OOPs {
    public static void main(String[] args) {
        cat c1;
        cat c2;
        cat c3 = new cat();
        cat c4 = new cat("Lucy");
        cat c5 = new cat("Spicy");
        cat c6 = new cat("Mirchi");
        new cat();

        System.out.println(c3.name);

        System.out.println(c4.name);
        System.out.println(c5.name);
        System.out.println(c6.name);

        c4.running();
        c5.running();
        c6.running();


    }

}

class cat {

    String name;// Instance variable
    cat(){
        name = "kitty";
    }

    cat(String nameParam){
        this.name = nameParam;
    }

    void running(){
        int local_Variable = 10; // Local variable

        System.out.println("who is running -> " + this.name);

    }

        }


