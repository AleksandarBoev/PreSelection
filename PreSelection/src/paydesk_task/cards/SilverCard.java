package paydesk_task.cards;

import java.math.BigDecimal;

public class SilverCard extends BaseCard {
    public SilverCard(BigDecimal purchaseValue, BigDecimal turnover) {
        super(purchaseValue, turnover);
    }

    @Override
    public BigDecimal getDiscountRate() {
        if (super.getTurnover().compareTo(BigDecimal.valueOf(300)) > 0) {
            return BigDecimal.valueOf(3.5);
        }

        return BigDecimal.valueOf(2);
    }
}
