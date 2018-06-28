public class Humanoid extends Bot{
    BotFactory botFactory;

    public Humanoid(BotFactory factory){
        this.botFactory = factory;
    }

    void buildBot() {
        System.out.println("Building bot: " + getBotName());
        lowerPart = botFactory.addLowerPart();
        upperPart = botFactory.addUpperPart();
        ai = botFactory.addAI();
    }
}