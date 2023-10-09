package I_metoder;

import java.util.Scanner;

public class Regnemaskine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        char op;
        double result;

        while (true) {
            System.out.println("Velkommen til Regnemaskinen");
            System.out.println(" + for addition");
            System.out.println(" - for subtraktion");
            System.out.println(" * for multiplikation");
            System.out.println(" / for division");
            System.out.println(" q for quit");
            System.out.print("Intast operator: ");
            op = input.next().charAt(0);

            if (op == 'q'){
                System.out.println("Tak for idag");
                break;
            }

            System.out.print("Indtast tal1: ");
            num1 = input.nextDouble();

            System.out.print("Indtast tal2: ");
            num2 = input.nextDouble();

            switch (op) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Resultat: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Resultat: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Resultat: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Resultat: " + result);
                    } else {
                        System.out.println("Fejl: Kan ikke dividere med 0.");
                    }
                    break;

            } //while
        }
    }
}
