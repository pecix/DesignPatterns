package DesignPatterns.adapter;

public class PaymentWrapper {

    //    private PayPalV1 paymentSystem;
    private PayPalV2 paymentSystem;

    public PaymentWrapper() {
//        paymentSystem = new PayPalV1();
        paymentSystem = new PayPalV2();
    }

    public void pay(float payment) {
//        paymentSystem.sendPayment(payment);
        paymentSystem.payment(payment);
    }
}
