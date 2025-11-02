package ex_19_OPPs_AccessModifier.police;

public class Cop {

    public int gun;
    private String icard;

   public Cop(int bullet){
       this.gun = bullet;
   }

   //method and /Behav

    protected void canIShoot(){
        System.out.println("Yes you can");
    }
    void thisDefaultF1(){
        System.out.println("Hi cop");
    }

    public static class Rahul extends Cop {
        public Rahul(int bullet) {
            super(bullet);
        }

        public static void main(String[] args) {
            Cop p = new Cop(100);
            p.thisDefaultF1();
        }
    }
}
