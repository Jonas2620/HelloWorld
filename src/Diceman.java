import java.util.Random;

public class Diceman {
    public static void main(String[] args) {
        Random gen = new Random();
        String activity = "";
        System.out.println("Diceman Loop");

        int dice;
        do {
            dice = gen.nextInt(6) + 1; // [1,6]
            if (dice == 1) {
                activity = "Breakfast";
            } else if (dice == 2) {
                activity = "Study";
            } else if (dice == 3) {
                activity = "Swim";
            } else if (dice == 4) {
                activity = "Go fishing";
            } else if (dice == 5) {
                activity = "Call mom";
            } else if (dice == 6) {
                activity = "Back to bed";
            }
            System.out.println("You rolled a " + dice + ": " + activity);
        } while (dice != 6);

        System.out.println("Goodbye");
    }
}
