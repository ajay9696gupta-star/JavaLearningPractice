package ex_23_Exceptions;

public class Lab203_CustomException {
    public static void main(String[] args) {
        try {
            Bank sbi = new Bank("INR",100);
            Bank axis = new Bank("INR", 123);
            Integer total_bal = sbi.add(axis);
            System.out.println(total_bal);

            Bank jb_chase = new Bank("USD",101);
            Integer total_bal_all_countries = sbi.add(jb_chase);
            System.out.println(total_bal_all_countries);
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount){
        this.currency = currency;
        this.amount = amount;
    }

    public Integer add(Bank bank) throws CustomException {
        if(!bank.currency.equalsIgnoreCase("INR")){
            throw new CustomException("Currency MisMatch, Can't proceed");
        }
        return bank.amount + this.amount;
    }
}

class CustomException extends Exception {
    CustomException(String msg){
        super(msg);
    }
}