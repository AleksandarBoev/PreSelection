package pay_desk_task.cards;

import java.math.BigDecimal;

public class BronzeCard implements Card {
    @Override
    public BigDecimal getDiscountRate(BigDecimal turnover) {
        if (turnover.compareTo(BigDecimal.valueOf(100)) < 0) {
            return BigDecimal.ZERO;
        }

        if (turnover.compareTo(BigDecimal.valueOf(300)) <= 0) {
            return BigDecimal.valueOf(0.01);
        }

        return BigDecimal.valueOf(0.025);
    }
}
