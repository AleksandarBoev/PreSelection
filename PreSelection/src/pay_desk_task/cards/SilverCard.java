package pay_desk_task.cards;

import java.math.BigDecimal;

public class SilverCard implements Card {
    @Override
    public BigDecimal getDiscountRate(BigDecimal turnover) {
        if (turnover.compareTo(BigDecimal.valueOf(300)) > 0) {
            return BigDecimal.valueOf(0.035);
        }

        return BigDecimal.valueOf(0.02);
    }
}
