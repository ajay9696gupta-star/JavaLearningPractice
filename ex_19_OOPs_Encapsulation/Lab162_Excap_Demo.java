package ex_19_OOPs_Encapsulation;

public class Lab162_Excap_Demo {
    public static void main(String[] args) {
        EliteLogin eliteLogin = new EliteLogin("admin","Password123");
        System.out.println(eliteLogin.password);
        eliteLogin.password = "123";
        System.out.println(eliteLogin.password);

        GoodEliteLogin goodEliteLogin = new GoodEliteLogin("Admin","Pass123");
        //System.out.println(goodEliteLogin.password);
        String user = goodEliteLogin.getUsername();
        System.out.println(user);
        String pass = goodEliteLogin.getPassword();
        System.out.println(pass);
       goodEliteLogin.setPassword("Ajaychild@123",false);


    }

}

class EliteLogin{
    public String username;
    public String password;

    public EliteLogin(String username,String password){
        this.username = username;
        this.password = password;
    }
}

class GoodEliteLogin{
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean IsGoodAdmin) {
        if (IsGoodAdmin){
            this.password = password;
        }else{
            System.out.println("Not Allowed");
        }

    }

    // Instance Variable |Data Variable |Attribute |Fields| properties| member variable
  private String username;
  private String password;

  GoodEliteLogin(String username,String password){
      this.username = username;
      this.password = password;
  }

}