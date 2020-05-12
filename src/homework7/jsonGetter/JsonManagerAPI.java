package homework7.jsonGetter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;

class JsonManagerAPI {

    static JSONArray getJsonFromUrl(URL url) throws IOException {

        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        JSONArray userList = new JSONArray();

        try (InputStream in = new BufferedInputStream(con.getInputStream());
             BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {

            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(reader);
            userList = (JSONArray) obj;
        } catch (ParseException e) {
            System.out.println("Can't parse the object");
        }
        return userList;
    }

    static JSONArray getJsonFromFile(File file) {
        JSONArray userList = new JSONArray();
        try (FileReader in = new FileReader(file)) {

            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(in);
            userList = (JSONArray) obj;
        } catch (ParseException e) {
            System.out.println("Can't parse the object");
        } catch (IOException i) {
            System.out.println("Something wrong with file");
        }
        return userList;
    }

    static void saveJsonToFile(JSONArray jsonArray, File file) {
        try (FileWriter out = new FileWriter(file)) {
            out.write(jsonArray.toJSONString());
        } catch (IOException e) {
            System.out.println("Something wrong with file.");
        }
    }

    static ArrayList<User> convertToJavaArray(JSONArray userList) {
        ArrayList<User> newUserList = new ArrayList<>();
        for (Object o : userList) {
            JSONObject jsonObject = (JSONObject) o;
            Long userId = (Long) jsonObject.get("userId");
            Long id = (Long) jsonObject.get("id");
            String title = (String) jsonObject.get("title");
            boolean completed = (boolean) jsonObject.get("completed");
            newUserList.add(new User(userId, id, title, completed));
        }
        return newUserList;
    }

    static void printUsers(ArrayList<User> userList) {
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }
}