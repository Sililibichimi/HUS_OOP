package oop_hus.lab10.strategy.ex02;

public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cardVerificationValue;

    public CreditCard(String number, String date, String cardVerificationValue) {
        this.amount = 100000;
        this.number = number;
        this.date = date;
        this.cardVerificationValue = cardVerificationValue;
    }

    public int getAmount() {
        return amount;
    }

    public String getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String getCardVerificationValue() {
        return cardVerificationValue;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCardVerificationValue(String cardVerificationValue) {
        this.cardVerificationValue = cardVerificationValue;
    }
}
