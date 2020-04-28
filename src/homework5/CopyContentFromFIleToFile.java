package homework5;

import java.io.*;

public class CopyContentFromFIleToFile {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("/Users/stepan/Desktop/java-training/input.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("/Users/stepan/Desktop/java-training/output.txt"));

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("Content copied!");
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("Error with files.");
        }
    }
}
