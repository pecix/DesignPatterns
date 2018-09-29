package DesignPatterns.chain;

public class NoCashAvailable extends Withdrawal {
    @Override
    protected int getAvailableNumberOfNotes() {
        return 0;
    }

    @Override
    protected int getValue() {
        return 0;
    }

    @Override
    public void processRequest(CashRequest request) {
        System.out.println("Wypłata nie jest możliwa");
    }
}
