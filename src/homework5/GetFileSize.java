package homework5;

import java.io.File;

public class GetFileSize {

    public static void main(String[] args) {
        File file = new File("/Users/stepan/Desktop/40776959");
        if (file.exists()) {
            double sizeB = file.length();
            double sizeKb = Math.round(sizeB / 1024 * 100.0) / 100.0;
            double sizeMb = Math.round(sizeKb / 1024 * 100.0) / 100.0;
            System.out.println("Here is " + file + " file size:" + "\nin bytes: " + sizeB + "\nin kilobytes: " + sizeKb + "\nin megabytes: " + sizeMb);
        } else {
            System.out.println("The " + file + " file does not exist.");
        }
    }
}

