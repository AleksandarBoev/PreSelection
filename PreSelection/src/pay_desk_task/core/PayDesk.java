package pay_desk_task.core;

import pay_desk_task.cards.Card;

import java.math.BigDecimal;

public class PayDesk {
    public static String getAllMessages(BigDecimal turnover, BigDecimal purchaseValue, Card card) {
        StringBuilder result = new StringBuilder();

        result.append(getPurchaseValueMessage(purchaseValue)).append(System.lineSeparator());
        result.append(getDiscountRateMessage(turnover, card)).append(System.lineSeparator());
        result.append(getDiscountMessage(turnover, purchaseValue, card)).append(System.lineSeparator());
        result.append(getTotalMessage(turnover, purchaseValue, card));

        return result.toString();
    }

    public static String getPurchaseValueMessage(BigDecimal purchaseValue) {
        return String.format("Purchase value: $%.2f", purchaseValue);
    }

    public static String getDiscountRateMessage(BigDecimal turnover, Card card) {
        return String.format("Discount rate: %.1f%%", card.getDiscountRate(turnover).multiply(BigDecimal.valueOf(100)));
    }

    public static String getDiscountMessage(BigDecimal turnover, BigDecimal purchaseValue, Card card) {
        return String.format("Discount: $%.2f", getDiscount(turnover, purchaseValue, card));
    }

    public static String getTotalMessage(BigDecimal turnover, BigDecimal purchaseValue, Card card) {
        return String.format("Total: $%.2f", getTotal(turnover, purchaseValue, card));
    }

    private static BigDecimal getDiscount(BigDecimal turnover, BigDecimal purchaseValue, Card card) {
        return purchaseValue.multiply(card.getDiscountRate(turnover));
    }

    private static BigDecimal getTotal(BigDecimal turnover, BigDecimal purchaseValue, Card card) {
        return purchaseValue.subtract(getDiscount(turnover, purchaseValue, card));
    }
}
