package homework5;

import java.io.File;

public class GetFilesByExtension {

    public static void main(String[] args) {
        File file = new File("resources");
        String extension = ".txt";
        String[] names = file.list((dir, name) -> name.endsWith(extension));
        if (names == null) {
            System.out.println("Not existing directory.");
        } else if (names.length == 0) {
            System.out.println("No files found in this directory.");
        } else {
            System.out.println("Here are the " + extension + " files in " + file + ".");
            for (String path : names) {
                System.out.println(path);
            }
        }
    }
}
