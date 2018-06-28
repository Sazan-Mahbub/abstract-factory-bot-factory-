public class DroneFactory implements BotFactory {

    @Override
    public BotLowerPart addLowerPart() {
        return new DroneLowerPart();
    }

    @Override
    public BotUpperPart addUpperPart() {
        return new DroneUpperPart();
    }

    @Override
    public BotAI addAI() {
        return new DroneAI();
    }
}
