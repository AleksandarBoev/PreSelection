package paydesk_task.cards;

import java.math.BigDecimal;

public interface Card {
    BigDecimal getPurchaseValue();

    BigDecimal getDiscountRate();

    BigDecimal getDiscount();

    BigDecimal getTotal();
}
