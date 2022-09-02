import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Multilingual_Wordle {
    public static void main(String[] args) {
        String filename = null;
        FileInputStream myFile = null;

        System.out.println("Enter dictionary filename: ");
        // set up scanner to read from keyboard
        Scanner scnr = new Scanner(System.in);
        // read in filename and save to string
        filename = scnr.nextLine();

        // Try to open the file, otherwise throw exception
        try {
            myFile = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            System.err.println("Could not open input file.");
        }

        // read in a dictionary file with all words
        ArrayList<String> wordlist = new ArrayList<String>();
        Scanner fileReader = new Scanner(myFile).useDelimiter("\\n"); //set the scanner to read from a file

        // keep reading until the end of the file is reached
        while (fileReader.hasNextLine()) {
            String word = fileReader.nextLine(); // read line
            System.out.println(word); // print out word
            wordlist.add(word); // add word to ArrayList
        }
    }
}
