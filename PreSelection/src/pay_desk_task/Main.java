package pay_desk_task;


import pay_desk_task.cards.BronzeCard;
import pay_desk_task.cards.Card;
import pay_desk_task.cards.GoldCard;
import pay_desk_task.cards.SilverCard;
import pay_desk_task.engine.Engine;
import pay_desk_task.engine.PayDeskTaskEngine;
import pay_desk_task.output.ConsoleWriter;
import pay_desk_task.output.OutputWriter;

public class Main {
    public static void main(String[] args) {
        OutputWriter outputWriter = new ConsoleWriter();

        Card bronzeCard = new BronzeCard();
        Card silverCard = new SilverCard();
        Card goldCard = new GoldCard();

        Engine engine = new PayDeskTaskEngine(outputWriter, bronzeCard, silverCard, goldCard);
        engine.run();
    }
}
