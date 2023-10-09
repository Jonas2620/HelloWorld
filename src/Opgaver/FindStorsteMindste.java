package Opgaver;

import java.util.Scanner;

public class FindStorsteMindste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int antalTal = 10;
        int størsteTal = Integer.MIN_VALUE;
        int mindsteTal = Integer.MAX_VALUE;

        for (int i = 1; i <= antalTal; i++) { // i er en variabel
            System.out.print("Indtast tal #" + i + ": "); // i sætter vi til at starte med 1, derefter sætter vi den til antalTal som vi før har sat til 10.
            int tal = scanner.nextInt();

            if (tal > størsteTal) {
                størsteTal = tal;
            }

            if (tal < mindsteTal) {
                mindsteTal = tal;
            }
        }

        System.out.println("Det største tal er: " + størsteTal);
        System.out.println("Det mindste tal er: " + mindsteTal);

        scanner.close();
    }
}
