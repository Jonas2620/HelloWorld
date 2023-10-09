import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Wordcount {
    public static void main(String[] args) {
            // Initialize ArrayList to store words
        ArrayList<String> wordList = new ArrayList<>();

        try {
            // Read the text file
            BufferedReader reader = new BufferedReader(new FileReader("Wordcount.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words using space as the delimiter
                String[] words = line.split(" ");
                for (String word : words) {
                    // Add the word to the ArrayList
                    wordList.add(word);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the total number of words
        System.out.println("Total number of words: " + wordList.size());

        // Count occurrences of the word "money"
        int moneyCount = 0;
        for (String word : wordList) {
            if (word.compareToIgnoreCase("money") == 0) {
                moneyCount++;
            }
        }

            // Print the count of occurrences of "money"
        System.out.println("Occurrences of 'money': " + moneyCount);
    }
}
