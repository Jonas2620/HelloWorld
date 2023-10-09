package BankApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BankApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account a1 = new Account("Joe Pass", 5);
        Account a2 = new Account("Jimmy Hendrix", 7);

        System.out.println("Von And Baken - Hoved Menu");
        while (true) {
            System.out.println("Tast 1: Opret konto");
            System.out.println("Tast 2: Kontoudskrift");
            System.out.println("Tast 3: Indsæt penge");
            System.out.println("Tast 4: Årlig rentetilskrivning");
            System.out.println("Tast 5: Afslut programmet");
            System.out.println("Indtast et tal [0,5]: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Opret konto
                    System.out.print("Indtast kontoejerens navn: ");
                    String ownerName = scanner.nextLine();
                    Account newAccount = new Account(ownerName, 0);
                    System.out.println("Konto oprettet med succes: " + newAccount);
                    break;

                case 2:
                    // Kontoudskrift
                    System.out.println("Kontoudskrift for konto 1:");
                    a1.printTransactions();
                    System.out.println("Kontoudskrift for konto 2:");
                    a2.printTransactions();
                    break;

                case 3:
                    // Indsæt penge
                    System.out.print("Indtast beløb at indbetale: ");
                    double depositAmount = scanner.nextDouble();
                    a1.deposit(depositAmount);
                    scanner.nextLine(); // Forbrug den resterende linje efter nextDouble()
                    break;

                case 4:
                    // Hæv penge
                    System.out.print("Indtast beløb at hæve: ");
                    double withdrawAmount = scanner.nextDouble();
                    a1.withdraw(withdrawAmount);
                    scanner.nextLine(); // Forbrug den resterende linje efter nextDouble()
                    break;

                case 5:
                    // Årlig rentetilskrivning
                    a1.anualInterest();
                    a2.anualInterest();
                    System.out.println("Årlig rentetilskrivning udført.");
                    break;

                case 0:
                    // Afslut programmet
                    System.out.println("Programmet afsluttes.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Ugyldigt valg. Prøv igen.");
                    break;
            }

            while (true) {
                System.out.print("Vil du udføre flere operationer på den samme konto? (ja/nej): ");
                String continueOption = scanner.nextLine();
                if (continueOption.equalsIgnoreCase("nej")) {
                    break; // Afslut løkken for flere operationer og gå tilbage til hovedmenuen
                } else if (continueOption.equalsIgnoreCase("ja")) {
                    // Brugeren ønsker at fortsætte med at arbejde med den samme konto
                    System.out.println("Tast 'deposit' for indbetaling eller 'withdraw' for hævning.");
                    String operation = scanner.nextLine();
                    switch (operation) {
                        case "deposit":
                            System.out.print("Indtast beløb at indbetale: ");
                            double amount = scanner.nextDouble();
                            a1.deposit(amount);
                            scanner.nextLine();
                            break;
                        case "withdraw":
                            System.out.print("Indtast beløb at hæve: ");
                            double withdrawAmount = scanner.nextDouble();
                            a1.withdraw(withdrawAmount);
                            scanner.nextLine();
                            break;
                        default:
                            System.out.println("Ukendt operation. Prøv igen.");
                            break;
                    }
                } else {
                    System.out.println("Ukendt svar. Prøv igen.");
                }
            }

            label:
            while (true) {
                System.out.print("Indtast operation (eller 'quit' for at afslutte): ");
                String operation = scanner.nextLine();

                switch (operation) {
                    case "quit":
                        break label; // Afslut programmet, hvis brugeren indtaster "quit"

                    case "deposit": { //indtast beløb at indbetale og udfør
                        System.out.print("Indtast beløb at indbetale: ");
                        double amount = scanner.nextDouble();
                        a1.deposit(amount);
                        scanner.nextLine(); // Forbrug den resterende linje efter næsteDouble()
                        break;
                    }
                    case "withdraw": { //indtast beløb at hæve og udfør
                        System.out.print("Indtast beløb at hæve: ");
                        double amount = scanner.nextDouble();
                        a1.withdraw(amount);
                        scanner.nextLine(); // Forbrug den resterende linje efter næsteDouble()
                        break;
                    }
                    default:
                        System.out.println("Ukendt operation. Prøv igen.");
                        break;
                }

                System.out.println(a1);
            }

            scanner.close();


            a1.deposit(100);
            a1.withdraw(50);

            a1.anualInterest();
            a2.anualInterest();

            a1.printTransactions();
            a2.printTransactions();

        }
    }

    static class Account {
        private static int no0fAccounts = 0;
        private final int accountNo;
        private final String owner;
        private double balance;   //Indestående
        private final double interestRate;   //Årlig rente i procent
        ArrayList<Transaction> transactions = new ArrayList<>();

        Account(String ow, double ir) {
            no0fAccounts++;
            accountNo = no0fAccounts;
            owner = ow;
            interestRate = ir;
            balance = 0;
        }

        void deposit(double amount) {
            balance = balance + amount;
            transactions.add(new Transaction("Indsat", amount, balance));
        }

        void withdraw(double amount) {
            if (balance >= amount) {
                balance = balance - amount;
                transactions.add(new Transaction("Hævet", amount, balance));
            } else {
                System.out.println("Ikke nok penge på kontoen til at foretage denne hævning.");
            }
        }

        void anualInterest() {
            double amount = balance * interestRate / 100;
            balance = balance + amount;
            transactions.add(new Transaction("Renter", amount, balance));
        }

        void printTransactions() {
            System.out.println(this);
            System.out.println("Tekst\tDato\t\tBeløb\tSaldo");
            for (Transaction t : transactions)
                System.out.println(t);
            System.out.println();
        }

        @Override
        public String toString() {
            return "Kontonr: " + accountNo + "\t" + owner + "\t" + balance;
        }
    }

    static class Transaction {
        String text;
        LocalDate date;
        double amount;
        double newBalance;

        public Transaction(String text, double amount, double newBalance) {
            this.text = text;
            this.amount = amount;
            this.newBalance = newBalance;
            date = LocalDate.now();
        }

        public String toString() {
            return text + "\t" + date + "\t" + amount + "\t" + newBalance;
        }
    }
}