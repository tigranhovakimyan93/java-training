package homework5.copyAndDelete;

import java.io.*;

class ActionsWithFiles {

    static void copyFile(File file1, File file2) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(file1));
            BufferedWriter out = new BufferedWriter(new FileWriter(file2));

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("File copied!");
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("Error with files.");
        }
    }

    static void deleteFile(File file) {
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted!");
            }
        } else {
            System.out.println("File not found.");
        }
    }
}