package statics;

public class StaticMain {
    static Wallet wallet1 = new Wallet();
    static Wallet wallet2 = new Wallet();
    static Wallet wallet3 = new Wallet();


    // TODO AP class Student with static String teacher & (nonstatic) int grade
    // TODO AP показать разницу между teacher & grade в мэйне
    // TODO AP очень похоже на то, что мы уже написали

    public static void main(String[] args) {

        printContents();


        // в каждом кошельке разная сумма
        wallet1.setMoney(200);
        wallet2.setMoney(500);
        wallet3.setMoney(130.25);

        // во всех кошельках одинаковое количество карт (максимальное)
        // даже если мы его меняем, оно одинаковое
        Wallet.setMaxCards(12);
        Wallet.setMaxCards(5);
        Wallet.setMaxCards(20);
        System.out.println("Wallet contents changed!");
        System.out.println();

        printContents();

        System.out.println(wallet1.getBrand());
        System.out.println(wallet2.getBrand());
        System.out.println(wallet3.getBrand());


    }

    public static void printContents(){
        System.out.println("Wallet 1: " + wallet1.getMoney());
        System.out.println("Wallet 2: " + wallet2.getMoney());
        System.out.println("Wallet 3: " + wallet3.getMoney());
        System.out.println();

        System.out.println("Wallet 1 max cards: " + wallet1.getMaxCards());
        System.out.println("Wallet 2 max cards: " + wallet2.getMaxCards());
        System.out.println("Wallet 3 max cards: " + wallet3.getMaxCards());
        System.out.println();
        System.out.println();
    }
}
