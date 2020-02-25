package pay_desk_task.cards;

import java.math.BigDecimal;

public class GoldCard implements Card {
    private static final BigDecimal MAX_CAP = BigDecimal.valueOf(0.10);

    @Override
    public BigDecimal getDiscountRate(BigDecimal turnover) {
        BigDecimal additionalPercentage = turnover.divideToIntegralValue(BigDecimal.valueOf(100)).divide(BigDecimal.valueOf(100));
        BigDecimal result = BigDecimal.valueOf(0.02).add(additionalPercentage);

        if (result.compareTo(MAX_CAP) > 0) {
            return MAX_CAP;
        }

        return result;
    }
}
