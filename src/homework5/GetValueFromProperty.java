package homework5;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.Properties;

public class GetValueFromProperty {

    public static void main(String[] args) {
        try {
            Properties p = new Properties();
            //////// for creating new properties file//////
//        p.setProperty("name", "Tigran");
//        p.setProperty("surname", "Hovakimyan");
//        p.setProperty("email", "mnmthovakimyan@gmail.com");
//        p.setProperty("age", "26");
//        p.setProperty("gender", "male");
//        p.store(new FileWriter("test.properties"), "Testing properties class");
            p.load(new FileReader("resources/test.properties"));
            System.out.println(p.values());
        } catch (IOException e) {
            System.out.println("Something wrong with file.");
        }
    }
}