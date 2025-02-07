package oop_hus.lab4.CustomerAndAccount;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(43, "Hanabeewiduu", 'M');
        Account account1 = new Account(1, customer1);
        System.out.println(account1);
        account1.setBalance(2000);
        System.out.println(account1);

        System.out.println("Name: " + account1.getCustomerName());
        System.out.println("Balance: " + account1.getBalance());
        System.out.println("Id: " + account1.getID());

        account1.deposit(1000);
        System.out.println(account1);

        account1.withdraw(500);
        System.out.println(account1);

        account1.withdraw(3000989);


    }
}
