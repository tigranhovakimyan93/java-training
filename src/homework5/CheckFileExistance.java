package homework5;

import java.io.File;

public class CheckFileExistance {

    public static void main(String[] args) {
        File file = new File("resources/input.txt");
        if (file.exists()) {
            System.out.println("The " + file + " file exists.");
        } else {
            System.out.println("The " + file + " file does not exist.");
        }
    }
}
