package paydesk_task.engine;

import paydesk_task.PayDesk;
import paydesk_task.cards.Card;
import paydesk_task.engine.Engine;
import paydesk_task.output.OutputWriter;

public class PayDeskTaskEngine implements Engine {
    private PayDesk payDesk;
    private Card[] cards;
    private OutputWriter writer;

    public PayDeskTaskEngine(OutputWriter writer, Card... cards) {
        this.writer = writer;
        this.cards = cards;
    }

    @Override
    public void run() {

    }
}
