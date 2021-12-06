package atm.bills;

import java.util.InputMismatchException;

public class DefaultBill implements Bill {
    private int billAmount;
    private Bill nextBill;
    private String result;

    public DefaultBill(int billAmount) {
        this.billAmount = billAmount;
    }

    public void setNext(Bill bill) {
        this.nextBill = bill;
    }

    @Override
    public void process(int amount) {
        if (nextBill != null) {
            nextBill.process(amount % billAmount);
        } else if (amount % billAmount != 0) {
            throw new InputMismatchException();
        }
        System.out.println("Receive " + amount / billAmount + " of " + billAmount + " UAH");
    }
}
