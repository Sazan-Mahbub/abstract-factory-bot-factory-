import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BotMaker botMaker = new RobotMaker();
        Bot bot = null;
        String s = null;
        while(true){
            System.out.println("Enter robot type.(1.humanoid, 2.drone, 3.domestic, 4.medical)\nEnter x to exit.");
            s = sc.nextLine();
            if (s.equalsIgnoreCase("x")){
                break;
            }
            try {
                bot = botMaker.requestBot(s);
                System.out.println();
            }catch (Exception e){
                System.out.println("Please enter correct name or number.");
            }

        }


    }
}
