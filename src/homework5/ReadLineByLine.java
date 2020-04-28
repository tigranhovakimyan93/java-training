package homework5;

import java.io.*;
import java.util.ArrayList;

public class ReadLineByLine {

    public static void main(String[] args) {
        try {
            ArrayList<String> lines = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("/Users/stepan/Desktop/java-training/input.txt"));
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
            System.out.println(lines);
            reader.close();
        } catch (IOException e) {
            System.out.println("Error with file.");
        }
    }
}
