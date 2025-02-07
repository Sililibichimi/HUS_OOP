package oop_hus.lab10.strategy.ex02;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
