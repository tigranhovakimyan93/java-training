package homework5.copyAndDelete;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String copy = "copy of ";
        String fileName = "input.txt";
        String newFileName = copy.concat(fileName);
        File file1 = new File("/Users/stepan/Desktop/java-training/", fileName);
        File file2 = new File("/Users/stepan/Desktop/java-training/", newFileName);
        ActionsWithFiles.copyFile(file1, file2);
        ActionsWithFiles.deleteFile(file2);
    }
}
