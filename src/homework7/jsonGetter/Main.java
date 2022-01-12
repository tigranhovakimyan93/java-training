package homework7.jsonGetter;

import org.json.simple.JSONArray;

import java.io.*;
import java.net.URL;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Properties jsonUrl = new Properties();
        try {
            jsonUrl.load(new FileReader("resources/jsonUrl.properties"));
        } catch (IOException e) {
            System.out.println("Properties file not found.");
        }
        File file = new File("resources/cache.txt");

        try {
            URL url = new URL(jsonUrl.getProperty("url"));
            JSONArray userList = JsonManagerAPI.getJsonFromUrl(url);
            JsonManagerAPI.printUsers(JsonManagerAPI.convertToJavaArray(userList));
            JsonManagerAPI.saveJsonToFile(userList, file);
        } catch (IOException e) {
            JSONArray userList = JsonManagerAPI.getJsonFromFile(file);
            JsonManagerAPI.printUsers(JsonManagerAPI.convertToJavaArray(userList));
        }
    }
}


