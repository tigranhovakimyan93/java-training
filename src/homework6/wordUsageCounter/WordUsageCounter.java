package homework6.wordUsageCounter;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class WordUsageCounter {


    public static void main(String[] args) {
        try {
            File inputFile = new File("resources/input.txt");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a word:");
            String enteredWord = scanner.nextLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter("resources/result.txt"));
            ArrayList<String> lines = WordUsageCounterAPI.readByLine(inputFile);
            for (int i = 0; i < lines.size(); i++) {
                int lineNumber = i + 1;
                writer.write("Line " + lineNumber + " contains " + WordUsageCounterAPI.getStringCountInLine(lines.get(i), enteredWord) + " " + enteredWord + "\n");
            }
            System.out.println("Please check the 'result.txt' files for the results.");
            writer.close();
        } catch (IOException e) {
            System.out.println("Something wrong with file.");
        }
    }
}