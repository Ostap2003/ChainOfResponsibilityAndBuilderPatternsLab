package atm;

import atm.bills.Bill;
import atm.bills.Bill10;
import atm.bills.Bill20;
import atm.bills.Bill5;

public class ATM {
    private Bill firstBill;

    public ATM() {
        Bill bill5 = new Bill5();
        Bill bill10 = new Bill10();
        Bill bill20 = new Bill20();

        bill20.setNext(bill10);
        bill10.setNext(bill5);

        firstBill = bill20;
    }

    public void process(int amount) {
        firstBill.process(amount);
    }
}
