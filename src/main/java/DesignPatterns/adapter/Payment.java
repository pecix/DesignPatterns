package DesignPatterns.adapter;

public class Payment {
    public static void main(String[] args) {

        PaymentWrapper wrapper = new PaymentWrapper();
        float payment = 500;

        wrapper.pay(payment);
    }

}
