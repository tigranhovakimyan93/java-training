package homework7.imageGetter;

import java.io.*;
import java.net.URL;

class ImageGetterAPI {

    static void getImageFromUrl(URL imageUrl, File file) throws IOException {
        try (InputStream in = imageUrl.openStream();
             OutputStream out = new FileOutputStream(file)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }
}
