package DesignPatterns.chain;

public class Withdrawal10 extends Withdrawal {
    @Override
    protected int getAvailableNumberOfNotes() {
        return 50;
    }

    @Override
    protected int getValue() {
        return 10;
    }
}
