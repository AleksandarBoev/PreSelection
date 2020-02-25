package paydesk_task.cards;

import java.math.BigDecimal;

public class BronzeCard extends BaseCard {
    public BronzeCard(BigDecimal purchaseValue, BigDecimal turnover) {
        super(purchaseValue, turnover);
    }

    @Override
    public BigDecimal getDiscountRate() {
        if (super.getTurnover().compareTo(BigDecimal.valueOf(100)) < 0) {
            return BigDecimal.ZERO;
        }

        if (super.getTurnover().compareTo(BigDecimal.valueOf(300)) <= 0) {
            return BigDecimal.ONE;
        }

        return BigDecimal.valueOf(2.5);
    }
}
