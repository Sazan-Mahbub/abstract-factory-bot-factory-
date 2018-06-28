public abstract class Bot{
    private String name;
    BotLowerPart lowerPart;
    BotUpperPart upperPart;
    BotAI ai;

    public String getBotName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    abstract void buildBot();
    public void testBot(){
        System.out.println(getBotName()+" is tested. Available parts: \n(1)"+lowerPart+"\n(2)"+upperPart+"\n(3)"+ai);
    }

    public String toString(){
        String s = "Bot "+ getBotName()+"\nconfig: Lower-Part: "+ lowerPart + " Upper-Part: "+ upperPart + " AI: "+ ai;
        return s;
    }

}