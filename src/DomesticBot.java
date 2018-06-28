public class DomesticBot extends Bot{
    BotFactory botFactory;

    public DomesticBot(BotFactory factory){
        this.botFactory = factory;
    }

    void buildBot() {
        System.out.println("Building bot: " + getBotName());
        lowerPart = botFactory.addLowerPart();
        upperPart = botFactory.addUpperPart();
        ai = botFactory.addAI();
    }
}