package homework5;

import java.io.*;

public class CopyContentFromFIleToFile {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("resources/input.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("resources/output.txt"));

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
