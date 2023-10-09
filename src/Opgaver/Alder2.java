package Opgaver;

import java.util.Random;

public class Alder2
{
    public static void main(String[] arg)
    {
        Random gen = new Random();
        int alder = gen.nextInt(100);

        if (alder >= 18)
            System.out.println("Du er myndig.");
        else if (alder <=18)
            System.out.println("Du er ikke myndig");
        System.out.println("Du er " + alder + " år.");
    }
}