package task2;

import java.math.BigDecimal;

public class PayDesk {
    private static BigDecimal turnover;
    private static BigDecimal purchaseValue;
    //TODO figure out how to set something to bronze, how to make the STATIC methods, save stuff and so on...
    //TODO maybe just make everything static and in the explanation notes just say it is not much of a good practise
    //and explain that non static stuff can't be accessed from static context.
    //to create a class called PayDesk containing static method(s)
    // that output the discount rate, the discount and the total purchase value;

    /*
    Bronze:
    a. Mock data: turnover $0, purchase value $150;
    b. Output:

    Purchase value: $150.00

    Discount rate: 0.0%

    Discount: $0.00

    Total: $150.00
     */
    public static void setTurnover(BigDecimal turnoverValue) {
        turnover = turnoverValue;
    }

    public static void setPurchaseValue(BigDecimal purchaseValue) {
        purchaseValue = purchaseValue;
    }
}
