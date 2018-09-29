package DesignPatterns.chain;

public class ATM {
    public static void main(String[] args) {
        Withdrawal pln200 = new Withdrawal200();
        Withdrawal pln100 = new Withdrawal100();
        Withdrawal pln50 = new Withdrawal50();
        Withdrawal pln20 = new Withdrawal20();
        Withdrawal pln10 = new Withdrawal10();

        CashRequest cashRequest = new CashRequest(5000);

        pln200.setSuccessor(pln100);
        pln100.setSuccessor(pln50);
        pln50.setSuccessor(pln20);
        pln20.setSuccessor(pln10);
        pln10.setSuccessor(new NoCashAvailable());

        pln200.processRequest(cashRequest);
    }
}
