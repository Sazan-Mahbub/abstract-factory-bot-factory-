public abstract class BotMaker {

    protected abstract Bot makeBot(String botType);

    public Bot requestBot(String botType) {
        Bot bot = makeBot(botType);
        bot.buildBot();

        bot.testBot();
        return bot;
    }
}