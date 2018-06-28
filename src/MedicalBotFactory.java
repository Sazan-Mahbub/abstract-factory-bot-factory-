public class MedicalBotFactory implements BotFactory {

    @Override
    public BotLowerPart addLowerPart() {
        return new MedicalBotLowerPart();
    }

    @Override
    public BotUpperPart addUpperPart() {
        return new MedicalBotUpperPart();
    }

    @Override
    public BotAI addAI() {
        return new MedicalBotAI();
    }
}
