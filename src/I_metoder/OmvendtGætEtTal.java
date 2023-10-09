package I_metoder;
import java.util.Scanner;

public class OmvendtGætEtTal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tænk på et tal mellem 1 og 100.");
        System.out.println("jeg vil så prøve at gætte det.");
        System.out.println("hver venlig at skrive 'h' hvis gættet er for højt, 'l' hvis det er for lavt, og 'r' hvis det er rigtigt.");

        int nedreGrænse = 1;
        int øvreGrænse = 100;
        int forsøg = 0;

        while (true) {
            int gæt = (nedreGrænse + øvreGrænse) / 2;
            System.out.println("Er det " + gæt + "? (h/l/r)");
            String response = scanner.next();

            if (response.equalsIgnoreCase("r")) {
                System.out.println("Godt! jeg gættede dit tal på " + forsøg + " forsøg.");
                break;
            } else if (response.equalsIgnoreCase("h")) {
                øvreGrænse = gæt - 1;
            } else if (response.equalsIgnoreCase("l")) {
                nedreGrænse = gæt + 1;
            } else {
                System.out.println("ikke gyldig input. hver så venligt at skrive 'h', 'l', eller 'r'.");
            }

            forsøg++;
        }
        scanner.close();
    }
}
