public class DomesticBotFactory implements BotFactory {

    @Override
    public BotLowerPart addLowerPart() {
        return new DomesticBotLowerPart();
    }

    @Override
    public BotUpperPart addUpperPart() {
        return new DomesticBotUpperPart();
    }

    @Override
    public BotAI addAI() {
        return new DomesticBotAI();
    }
}
