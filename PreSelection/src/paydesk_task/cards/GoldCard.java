package paydesk_task.cards;

import java.math.BigDecimal;

public class GoldCard extends BaseCard {
    private static final BigDecimal MAX_CAP = BigDecimal.valueOf(10);

    public GoldCard(BigDecimal purchaseValue, BigDecimal turnover) {
        super(purchaseValue, turnover);
    }

    @Override
    public BigDecimal getDiscountRate() {
        BigDecimal result = BigDecimal.valueOf(2).add(super.getTurnover().divideToIntegralValue(BigDecimal.valueOf(100)));

        if (result.compareTo(MAX_CAP) > 0) {
            return MAX_CAP;
        }

        return result;
    }
}
