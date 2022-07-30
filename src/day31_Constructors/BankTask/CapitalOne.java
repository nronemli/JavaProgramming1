package day31_Constructors.BankTask;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Nur", 123456, 1000);
        System.out.println(account1);
        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(500);
        account1.checkBalance();
        account1.deposit(500);
        account1.checkBalance();

        BankAccount account2= new BankAccount();
        account2.setInfo("Selim",2022,250);
        account2.checkBalance();



    }
}
