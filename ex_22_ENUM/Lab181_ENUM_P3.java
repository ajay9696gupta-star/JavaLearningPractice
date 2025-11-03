package ex_22_ENUM;

public class Lab181_ENUM_P3 {
    public static void main(String[] args) {
        System.out.println(HEX_COLORs.RED.getHexCode());
    }
}

enum HEX_COLORs{
    RED("#FF000"),
    GREEN("#00FF00"),
    BLUE("#0000FF"),
    YELLOW("#FFFF00");

    public String getHexCode() {
        return hexCode;
    }

    public void setHexCode(String hexCode) {
        this.hexCode = hexCode;
    }

    private String hexCode;

    HEX_COLORs(String hexCode) {
        this.hexCode = hexCode;
    }
}
