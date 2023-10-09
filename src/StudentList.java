import java.io.*;
import java.util.ArrayList;

public class StudentList {
    public static void main (String[]arg) throws IOException {
        FileReader fil = new FileReader("Input_output//StudentList.txt");
        BufferedReader ind = new BufferedReader(fil);

        ArrayList<String> list = new ArrayList<>();
        String linje = ind.readLine();
        while (linje != null)
        {
            String[] bidder = linje.split(" ");
            String navn = bidder[1];
            list.add(navn);
            linje = ind.readLine();
        }
        fil.close();
        list.sort(null);
        for (String s: list){
            System.out.println(s);
        }
        savelist(list);
    } // main

    static void savelist(ArrayList<String> l) throws IOException {
        FileWriter fil = new FileWriter("src//StudentListSorted.txt");
        PrintWriter ud = new PrintWriter(fil);
        for (String s: l){
            ud.println(s);
        }
       fil.close();
    }
}