package I_metoder;
import java.util.Scanner;

public class Gennemsnit {
    public static void gennemsnit(int tal1, int tal2, int tal3, int tal4) {
        double gns = (tal1 + tal2 + tal3 + tal4) / 4.0;
        double sum = (tal1 + tal2 + tal3 + tal4);
        System.out.println("summen af tallene er:  "+sum);
        System.out.println("Gennemsnittet af tallene er: " + gns);

    }
    public static void main(String[] args) {
        int tal1; int tal2; int tal3; int tal4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast værdi for de fire tal");
        System.out.println("Indtast det først tal: ");
        tal1 = scanner.nextInt();
        System.out.println("Indtast det andet tal: ");
        tal2 = scanner.nextInt();
        System.out.println("Indtast det tredje tal: ");
        tal3 = scanner.nextInt();
        System.out.println("Indtast det fjerre tal: ");
        tal4 = scanner.nextInt();
        gennemsnit(tal1, tal2, tal3, tal4);

    }
}
