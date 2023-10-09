package I_metoder;
import java.util.Random;
import java.util.Scanner;

public class GætEtTal {
    public static void main(String[] args) {
        Random rng = new Random();
        int hemmeligtTal = rng.nextInt(100) + 1;
        System.out.println("Jeg tænker på et tal mellem 1 og 100. prøv at gætte dette tal.");
        gætEtTalSpil(hemmeligtTal);
    }

    public static void gætEtTalSpil(int hemmeligtTal) {
        int gæt;
        Scanner scanner = new Scanner(System.in);
        int forsøg = 0;
        while (true) {
            forsøg++;
            System.out.println("indtast dit gæt: ");
            gæt = scanner.nextInt();

            if (gæt == hemmeligtTal) {
                System.out.println("Tillykke! Du har gættet rigtigt. Tallet er: "+gæt+".");
                System.out.println("Du har brugt "+forsøg+" forsøg.");
                break;
            } else if (gæt < hemmeligtTal) {
                System.out.println("Tallet jeg tænker på er højere, prøv igen.");
                //System.out.println("Du har brugt "+forsøg+" forsøg.");
            } else {
                System.out.println("Tallet jeg tænker på er lavere, prøv igen.");
                //System.out.println("Du har brugt "+forsøg+" forsøg.");
            }
        }

        scanner.close();
    }
}
