package homework5;

import java.io.*;
import java.util.ArrayList;

public class GetNumberOFLinesInFile {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("resources/input.txt"));
            String line = reader.readLine();
            int lineCount = 0;
            while (line != null) {
                lineCount += 1;
                line = reader.readLine();
            }
            System.out.println(lineCount);
            reader.close();
        } catch (IOException e) {
            System.out.println("Error with file.");
        }
    }
}
