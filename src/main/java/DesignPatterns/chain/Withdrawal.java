package DesignPatterns.chain;

public abstract class Withdrawal {

    protected Withdrawal successor;

    abstract protected int getAvailableNumberOfNotes();

    abstract protected int getValue();


    public void setSuccessor(Withdrawal successor) {
        this.successor = successor;
    }

    public void processRequest(CashRequest request) {

        int numberOfNotes = request.getAmount() / getValue();

        if (numberOfNotes > getAvailableNumberOfNotes()) {
            numberOfNotes = getAvailableNumberOfNotes();
        }

        int cashDiffrence = request.getAmount() - numberOfNotes * getValue();
        if (numberOfNotes <= getAvailableNumberOfNotes() && cashDiffrence == 0) {
            System.out.println("Wypłata jest możliwa");
        } else if (successor != null) {
            request.setAmount(cashDiffrence);
            successor.processRequest(request);
        }
    }
}
