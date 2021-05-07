import Enums.PaymentMethod;

import java.util.Date;
public class Transaction {
    private int id;
    private PaymentMethod method;
    private double amount;
    private boolean isPaid;
    private Date paidAt;
    private Date mustPaid;

}
