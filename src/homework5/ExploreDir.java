package homework5;

import java.io.*;

public class ExploreDir {

    public static void main(String[] args) {
        File file = new File("/Users/stepan/Desktop/java-training");
        String[] fileNames = file.list();
        if (fileNames == null) {
            System.out.println("Not existing directory.");
        } else if (fileNames.length == 0) {
            System.out.println("No files found in this directory.");
        } else {
            System.out.println("Here are the files in " + file + ".");
            for (String fileName : fileNames) {
                System.out.println(fileName);
            }
        }
    }
}
