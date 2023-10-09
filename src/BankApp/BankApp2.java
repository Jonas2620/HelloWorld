package BankApp;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BankApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account a1 = new Account("Joe Pass", 5);
        Account a2 = new Account("Jimmy Hendrix", 7);

        System.out.println("Velkommen til bankappen");
        System.out.println("Indtast ´deposit´ eller ´withdraw´ for at udføre operationerne.");


        while(true) {
        System.out.print("Indtast operation (eller 'quit' for at afslutte): ");
        String operation = scanner.nextLine();

        if (operation.equals("quit")) {
            break; // Afslut programmet, hvis brugeren indtaster "quit"
        } else if (operation.equals("deposit")) { //indtast beløb at indbetale og udfør
            System.out.print("Indtast beløb at indbetale: ");
            double amount = scanner.nextDouble();
            a1.deposit(amount);
            scanner.nextLine(); // Forbrug den resterende linje efter næsteDouble()
        } else if (operation.equals("withdraw")) { //indtast beløb at hæve og udfør
            System.out.print("Indtast beløb at hæve: ");
            double amount = scanner.nextDouble();
            a1.withdraw(amount);
            scanner.nextLine(); // Forbrug den resterende linje efter næsteDouble()
        } else {
            System.out.println("Ukendt operation. Prøv igen.");
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
class Account {
    private static int no0fAccounts = 0;
    private int accountNo;
    private String owner;
    private double balance;   //Indestående
    private double interestRate;   //Årlig rente i procent
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    Account(String ow, double ir){
        no0fAccounts++;
        accountNo = no0fAccounts;
        owner = ow;
        interestRate = ir;
        balance = 0;
    }

    void setOwner(String newName){
        owner = newName;
    }

    void deposit(double amount){
        balance = balance+amount;
        transactions.add(new Transaction("Indsat", amount, balance));
    }

    void withdraw(double amount){
        if (balance >= amount) {
            balance = balance - amount;
            transactions.add(new Transaction("Hævet", amount, balance));
        } else {
            System.out.println("Ikke nok penge på kontoen til at foretage denne hævning.");
        }
    }

    void anualInterest() {
        double amount = balance * interestRate/100;
        balance = balance + amount;
        transactions.add(new Transaction("Renter", amount, balance));
    }

    void printTransactions(){
        System.out.println(this);
        System.out.println("Tekst\tDato\t\tBeløb\tSaldo");
        for (Transaction t: transactions)
            System.out.println(t);
        System.out.println();
    }
    @Override
    public String toString() {
        return "Kontonr: "+accountNo+"\t"+owner+"\t"+balance;
    }
}

class Transaction {
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

    public String toString(){
        return text+"\t"+date+"\t"+amount+"\t"+newBalance;
    }
}