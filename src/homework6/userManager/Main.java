package homework6.userManager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("resources/userList.txt");

            if (!file.exists()) {
                file = UserManagerAPI.createUsersFile(UserListProvider.getData());
            }
            ArrayList<User> userList = UserManagerAPI.getUserArrayListFromFile(file);

            System.out.println("You can enter the following commands to control the user list:" + "\nADD = For creating " +
                    "a new user," + "\nREMOVE = For removing a user," + "\nLIST = For viewing all users," + "\nEXIT = " +
                    "For saving all changes.");
            System.out.println("Please enter a command:");
            UserManagerAPI.doCommand(userList);
        } catch (Exception e) {
            System.out.println("Something wrong with the file.");
        }
    }
}
