package paydesk_task.cards;

import java.math.BigDecimal;

public abstract class BaseCard implements Card {
    private BigDecimal turnover;
    private BigDecimal purchaseValue;

    protected BaseCard(BigDecimal purchaseValue, BigDecimal turnover) {
        this.purchaseValue = purchaseValue;
        this.turnover = turnover;
    }

    @Override
    public BigDecimal getPurchaseValue() {
        return purchaseValue;
    }

    public abstract BigDecimal getDiscountRate();

    @Override
    public BigDecimal getDiscount() {
        return purchaseValue.multiply(getDiscountRate());
    }

    @Override
    public BigDecimal getTotal() {
        return purchaseValue.subtract(getDiscount());
    }

    protected BigDecimal getTurnover() {
        return turnover;
    }
}
