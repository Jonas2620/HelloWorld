package Opgaver;

import java.util.Random;

public class Diceman2 {
    public static void main(String[] args){
        Random gen = new Random();
        int dice = gen.nextInt(6)+1; // [1,6]
        String activity = "";

        System.out.println("Diceman");
        switch (dice) {
            case 1 -> System.out.println("Sleep");
            case 2 -> System.out.println("Go poopin");
            case 3 -> System.out.println("Go fishing");
            case 4 -> System.out.println("Call mom");
            case 5 -> System.out.println("Study");
            case 6 -> System.out.println("Play games");
        }
        System.out.println(activity);
        System.out.println("Goodbye");
    }
}
