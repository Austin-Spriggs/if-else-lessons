public class LessonOne {
    public static void main(String[] args) {
        int coins = 50;

        if (coins >= 30) {
            coins -= 30;
            System.out.println("Congrats! You bought the battle-axe!");
        } else {
            System.out.println("I'm sorry, you can't afford the battle-axe.");
        }
    }
}