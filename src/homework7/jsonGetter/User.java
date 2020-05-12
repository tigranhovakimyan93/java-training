package homework7.jsonGetter;

import java.io.Serializable;

class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private long userId;
    private long id;
    private String title;
    private boolean completed;

    User(long userId, long id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    private long getUserId() {
        return userId;
    }

    private long getId() {
        return id;
    }

    private String getTitle() {
        return title;
    }

    private boolean isCompleted() {
        return completed;
    }

    public String toString() {
        return "{" + "\nuserId: " + getUserId() +
                "\nid: " + getId() +
                "\ntitle: " + title +
                "\ncompleted: " + isCompleted() + "\n}";
    }
}
