package homework7.imageGetter;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        try {
            URL imageUrl = new URL("https://i.pinimg.com/originals/02/a3/b1/02a3b12c3ad7bed136ccd52832d24f6e.jpg");
            File file = new File("resources/downloadedImage.png");
            ImageGetterAPI.getImageFromUrl(imageUrl, file);
            System.out.println("Image downloaded!");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
