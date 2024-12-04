package equals;

import objects.Vehicle;

public class MainEqualsObjects {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12345, 1000);
        BankAccount account2 = new BankAccount(2345678, 1000);
        BankAccount account3 = new BankAccount(12345, 1000);
        BankAccount account4 = account1;
        Vehicle vehicle = new Vehicle("volvo", 2000, 100);

        System.out.println(account1.equals(account2));
        System.out.println(account1.equals(account3));
        System.out.println(account1.equals(account4));

        System.out.println();
        System.out.println(account1.equals(vehicle));

        System.out.println(account1.hashCode());
        System.out.println(account2.hashCode());
        System.out.println(account3.hashCode());
        System.out.println(account4.hashCode());

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);
    }
}
