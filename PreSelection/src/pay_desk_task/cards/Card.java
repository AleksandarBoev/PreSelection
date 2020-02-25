package pay_desk_task.cards;

import java.math.BigDecimal;

public interface Card {
    BigDecimal getDiscountRate(BigDecimal turnover);
}
