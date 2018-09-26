package DesignPatterns.adapter;

public class PayPalV1 {

    public void sendPayment(float payment) {
        System.out.println("Wysłanie kwoty: " + payment);
    }
}
