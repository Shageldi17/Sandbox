package statics;

public class Wallet {

    private final String BRAND = "Walletco.";
    private static int maxCards;
    private double money;

    public String getBrand() { return BRAND; }



    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public static int getMaxCards() {
        return maxCards;
    }

    public static void setMaxCards(int maxCards) {
        Wallet.maxCards = maxCards;
    }
}
