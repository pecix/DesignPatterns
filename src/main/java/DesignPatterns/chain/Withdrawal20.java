package DesignPatterns.chain;

public class Withdrawal20 extends Withdrawal {
    @Override
    protected int getAvailableNumberOfNotes() {
        return 50;
    }

    @Override
    protected int getValue() {
        return 20;
    }
}
