package homework6.userManager;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private String username;
    private int age;

    public User() {
    }

    User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    String getUsername() {
        return username;
    }

    int getAge() {
        return age;
    }
}
