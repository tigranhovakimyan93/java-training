package homework4.toDoList;

class Assign {

    private String name;
    private String team;

    enum Position {
        DEVELOPER, QA;
    }

    private Position position;

    Assign() {
    }

    Assign(String name, String team, Position position) {
        this.name = name;
        this.team = team;
    }

    String getName() {
        return name;
    }

    String getTeam() {
        return team;
    }

    Position getPosition() {
        return position;
    }
}
