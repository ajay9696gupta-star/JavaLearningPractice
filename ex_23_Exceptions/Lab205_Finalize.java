package ex_23_Exceptions;

public class Lab205_Finalize {
    public static void main(String[] args) {

        Lab205_Finalize lab205Finalize = new Lab205_Finalize();
        lab205Finalize = null;
        System.gc();
        System.out.println("Main method done");

    }

    public void finalize(){
        System.out.println("finalize method called before GC");
    }
}
