package homework4.toDoList;

class Task {

    private String title;
    private String description;
    private String startDate;
    private String endDate;
    private Assign assign;

    public enum Priority {
        MINOR, MAJOR, CRITICAL;
    }

    private Priority priority;

    public enum Status {
        OPEN,
        INPROGRESS,
        INQA,
        DONE;
    }

    private Status status;

    Task() {

    }

    Task(String title, String description, String startDate, String endDate, Assign assign, Status status, Priority priority) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.assign = assign;
        this.status = status;
        this.priority = priority;
    }

    String getTitle() {
        return title;
    }

    String getDescription() {
        return description;
    }

    String getStartDate() {
        return startDate;
    }

    String getEndDate() {
        return endDate;
    }

    Assign getAssign() {
        return assign;
    }

    Priority getPriority() {
        return priority;
    }

    Status getStatus() {
        return status;
    }
}
