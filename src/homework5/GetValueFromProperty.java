package homework5;

import java.io.*;
import java.util.Properties;

public class GetValueFromProperty {

    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
//        p.setProperty("name", "Tigran");
//        p.setProperty("surname", "Hovakimyan");
//        p.setProperty("email", "mnmthovakimyan@gmail.com");
//        p.setProperty("age", "26");
//        p.setProperty("gender", "male");
//////// for creating new properties file//////
//        p.store(new FileWriter("test.properties"), "Testing properties class");
        p.load(new FileReader("test.properties"));
        System.out.println(p.values());
    }
}