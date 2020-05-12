package homework6.userManager;

import java.util.ArrayList;

final class UserListProvider {

    private static ArrayList<User> userList;

    private UserListProvider() {
    }

    static ArrayList<User> getData() {

        if (userList != null) {
            return userList;
        }

        User user1 = new User("Armen", 27);
        User user2 = new User("Smbat", 99);
        User user3 = new User("Tigran", 26);

        userList = new ArrayList<>();

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        return userList;
    }
}
