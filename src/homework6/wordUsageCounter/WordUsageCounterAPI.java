package homework6.wordUsageCounter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WordUsageCounterAPI {

    static int getStringCountInLine(String line, String enteredWord) {
        int count = 0;
        Pattern pattern = Pattern.compile(Pattern.quote(enteredWord), Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    static ArrayList<String> readByLine(File file) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error with file.");
        }
        return lines;
    }
}
