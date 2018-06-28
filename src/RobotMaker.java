public class RobotMaker extends BotMaker{

    protected Bot makeBot(String botType) {
        Bot bot = null;

        if(botType.equalsIgnoreCase("1") || botType.equalsIgnoreCase("humanoid")){
            BotFactory factory = new HumanoidFactory();
            bot = new Humanoid(factory);
            bot.setName("Humanoid");
        }
        else if(botType.equalsIgnoreCase("2") || botType.equalsIgnoreCase("drone")){
            BotFactory factory = new DroneFactory();
            bot = new Drone(factory);
            bot.setName("Drone");
        }
        else if(botType.equalsIgnoreCase("3") || botType.equalsIgnoreCase("domestic")){
            BotFactory factory = new DomesticBotFactory();
            bot = new DomesticBot(factory);
            bot.setName("DomesticBot");
        }
        else if(botType.equalsIgnoreCase("4") || botType.equalsIgnoreCase("medical")){
            BotFactory factory = new MedicalBotFactory();
            bot = new MedicalBot(factory);
            bot.setName("MedicalBot");
        }

        return bot;
    }
}