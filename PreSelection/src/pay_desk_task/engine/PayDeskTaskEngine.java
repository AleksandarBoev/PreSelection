package pay_desk_task.engine;

import pay_desk_task.cards.Card;
import pay_desk_task.core.PayDesk;
import pay_desk_task.output.OutputWriter;

import java.math.BigDecimal;

public class PayDeskTaskEngine implements Engine {
    private Card[] cards;
    private OutputWriter outputWriter;

    public PayDeskTaskEngine(OutputWriter outputWriter, Card... cards) {
        this.outputWriter = outputWriter;
        this.cards = cards;
    }

    @Override
    public void run() {
        outputWriter.println(PayDesk.getAllMessages(BigDecimal.valueOf(0), BigDecimal.valueOf(150), cards[0]));
        outputWriter.println("");
        outputWriter.println(PayDesk.getAllMessages(BigDecimal.valueOf(600), BigDecimal.valueOf(850), cards[1]));
        outputWriter.println("");
        outputWriter.println(PayDesk.getAllMessages(BigDecimal.valueOf(1500), BigDecimal.valueOf(1300), cards[2]));
    }
}
