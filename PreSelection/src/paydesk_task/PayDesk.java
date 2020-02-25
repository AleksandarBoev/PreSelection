package paydesk_task;

import paydesk_task.cards.Card;

import java.math.BigDecimal;

public class PayDesk {
    public static String getPurchaseValueMessage(Card card) {
        return String.format("Purchase value: $%.2f", card.getPurchaseValue());
    }

    public static String getDiscountRateMessage(Card card) {
        return String.format("Discount rate: %.1f%%", card.getDiscountRate());
    }

    public static String getDiscountMessage(Card card) {
        return String.format("Discount: $%.2f", card.getDiscount());
    }

    public static String getTotalMessage(Card card) {
        return String.format("Total: $%.2f", card.getTotal());
    }

    //TODO mai trqbva da napravq "card" da vrushta samo i edinstveno discount i smqtanite neshta da stavat tuk!
    // no puk mi trqbva turnover. Moje bi
}
