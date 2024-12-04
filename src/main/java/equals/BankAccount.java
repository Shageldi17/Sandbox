package equals;

import java.util.Objects;

public class BankAccount {

    private int accountNumber;
    private int balance;

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
//}

    @Override
    public boolean equals(Object otherObject) {         //  bankAccount1.equals(bankAccount2); OR bankAccount2.equals(bankAccount1);

        if (otherObject.getClass() != BankAccount.class){        //      (BankAccount) truck -- не работает!
            return false;
        }
//       кастинг; похоже на   int num = (int) 3.9;
       BankAccount otherBankAccount = (BankAccount) otherObject;

        if (accountNumber == otherBankAccount.accountNumber && balance == otherBankAccount.balance) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance);
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }



//    public boolean equals(BankAccount other){
//        return
//              this.accountNumber == other.accountNumber &&
//                        this.balance == other.balance;
//
//    }


}
