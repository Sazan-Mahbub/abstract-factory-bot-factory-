public class HumanoidFactory implements BotFactory {

    @Override
    public BotLowerPart addLowerPart() {
        return new HumanoidBotLowerPart();
    }

    @Override
    public BotUpperPart addUpperPart() {
        return new HumanoidBotUpperPart();
    }

    @Override
    public BotAI addAI() {
        return new HumanoidBotAI();
    }
}
