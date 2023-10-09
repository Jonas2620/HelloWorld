import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class CopenhagenMarathon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        try {
            // Åbn filen Copenhagen Marathon.txt for at læse deltagerlisten.
            Scanner fileScanner = new Scanner(new File("Copenhagen Marathon.txt"));

            while (fileScanner.hasNextLine()) {
                String deltagerensNavn = fileScanner.nextLine().trim();
                int startnummer = random.nextInt(1000) + 1;
                char startGruppe = (char) (random.nextInt(4));

                // Kald metoden til bekræftelse og gem registreringen i en tekstfil.
                gemRegistrering(deltagerensNavn, startnummer, startGruppe);
            }

            fileScanner.close();
        } catch (IOException e) {
            System.err.println("Fejl ved læsning af deltagerlisten fra filen.");
            e.printStackTrace();
        }

        scanner.close();
    }

    public static void gemRegistrering(String deltagerensNavn, int startnummer, char startgruppe) {
        try {
            // Opret en tekstfil med deltagerens navn som filnavn.
            String filnavn = deltagerensNavn + ".txt";
            FileWriter writer = new FileWriter(filnavn);

            // Skriv registreringsoplysningerne til tekstfilen.
            writer.write("Dear " + deltagerensNavn + "!\n");
            writer.write("We are happy to receive your registration.\n");
            writer.write("Your start number is " + startnummer + "\n");
            writer.write("You start in group " + startgruppe + "\n");
            writer.write("Please check in 10 minutes before start.\n");

            writer.close();
        } catch (IOException e) {
            System.err.println("Fejl ved gemning af registrering i tekstfil.");
            e.printStackTrace();
        }
    }
}