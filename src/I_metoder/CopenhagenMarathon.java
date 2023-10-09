package I_metoder;
import java.util.Random;
import java.util.Scanner;

public class CopenhagenMarathon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please write how many that will be participating: ");
        int antalDeltagere = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < antalDeltagere; i++) {
            System.out.println("Please write the participating name: ");
            String deltagerensNavn = scanner.nextLine();

            int startnummer = random.nextInt(1000) + 1;
            char startGruppe = (char) (random.nextInt(4));

            bekræftelse(deltagerensNavn, startnummer, startGruppe);
        }
        scanner.close();
    }

    public static void bekræftelse(String deltagerensNavn, int startnummer, char startgruppe) {
        System.out.println("Dear "+deltagerensNavn+"!");
        System.out.println("We are happy to receive your registration.");
        System.out.println("Your start number is "+startnummer);
        System.out.println("You start in group "+startgruppe);
        System.out.println("Please check in 10 minutes before start.");
    }
}