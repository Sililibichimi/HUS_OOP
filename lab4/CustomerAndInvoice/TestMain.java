package oop_hus.lab4.CustomerAndInvoice;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Sideptraivocung", 10);
        System.out.println(customer1); // Customer's toString()

        customer1.setDiscount(8);
        System.out.println(customer1);
        System.out.println("id is: " + customer1.getID());
        System.out.println("name is: " + customer1.getName());
        System.out.println("discount is: " + customer1.getDiscount());

        //Test Invoice
        Invoice invoice1 = new Invoice(609, customer1, 423);
        System.out.println(invoice1);

        invoice1.setAmount(469);
        System.out.println(invoice1);
        System.out.println("id is: " + invoice1.getID());
        System.out.println("customer is: " + invoice1.getCustomer()); // Customer's toString()
        System.out.println("amount is: " + invoice1.getAmount());
        System.out.println("customer name is: " + invoice1.getCustomerName());
        System.out.println("customer id is: " + invoice1.getCustomerID());
        System.out.println("customer's name is: " + invoice1.getCustomerName());
        System.out.println("customer's discount is: " + invoice1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", invoice1.getAmountAfterDiscount());
    }
}
