package Opgaver;

import javax.swing.*;
import java.util.Random;

public class DicemanLoop {
    public static void main(String[] args){
        Random gen = new Random();
        int dice;
        String activity = "";
        int answer;
        boolean KeepGoing=true;
        System.out.println("Diceman Loop");

        while (KeepGoing){
            dice=gen.nextInt(6)+1;

            if (dice==1){
                activity="Breakfast";
            } else
            if (dice==2){
                activity="Study";
            } else
            if (dice==3){
                activity="Swim";
            }
            if (dice==4){
                activity="Go fishing";
            } else
            if (dice==5){
                activity="Call mom";
            } else
            if (dice==6){
                activity="Back to bed";
            }
            System.out.println(activity);

         //   if (dice==6) KeepGoing=false;
            answer = JOptionPane.showConfirmDialog(null, activity+"\n Try again?", "Diceman Loop", JOptionPane.YES_NO_CANCEL_OPTION);
            if (answer==JOptionPane.NO_OPTION) KeepGoing = false;
        }

        System.out.println("Goodbye");
    }
}
