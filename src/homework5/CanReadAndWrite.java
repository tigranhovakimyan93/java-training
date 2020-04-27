package homework5;

import java.io.File;

public class CanReadAndWrite {

    public static void main(String[] args) {
        File file = new File("/Users/stepan/Desktop/kkkk");
        if (file.exists()) {
            if (file.canRead() && file.canWrite()) {
                System.out.println("The " + file + " file is readable an writable.");
            } else if (file.canRead() && !file.canWrite()) {
                System.out.println("The " + file + " file is readable but not writable.");
            } else if (!file.canRead() && file.canWrite()) {
                System.out.println("The " + file + " file is not readable but it is writable.");
            } else {
                System.out.println("The " + file + " file not readable nor writable.");
            }
        } else {
            System.out.println("The " + file + " file does not exist.");
        }
    }
}
