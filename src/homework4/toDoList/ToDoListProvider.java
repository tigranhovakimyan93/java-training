package homework4.toDoList;

import java.util.ArrayList;

final class ToDoListProvider {

    private static ArrayList<Task> toDoList;

    private ToDoListProvider() {
    }

    static ArrayList<Task> getData() {

        if (toDoList != null) {
            return toDoList;
        }

        Assign armen = new Assign("Armen", "Android", Assign.Position.DEVELOPER);
        Assign arman = new Assign("Arman", "Android", Assign.Position.DEVELOPER);
        Assign ruben = new Assign("Ruben", "Android", Assign.Position.DEVELOPER);
        Assign smbat = new Assign("Smbat", "Android", Assign.Position.DEVELOPER);
        Assign tigran = new Assign("Tigran", "Android", Assign.Position.QA);

        Task task1 = new Task("Search screen", "Implement Search screen", "2020-04-24",
                "2020-04-31", armen, Task.Status.OPEN, Task.Priority.CRITICAL);
        Task task2 = new Task("Browse screen", "Implement Browse screen", "2020-04-23",
                "2020-04-28", arman, Task.Status.INPROGRESS, Task.Priority.CRITICAL);
        Task task3 = new Task("Library screen", "Implement Library screen", "2020-04-22",
                "2020-04-27", smbat, Task.Status.INPROGRESS, Task.Priority.CRITICAL);
        Task task4 = new Task("Wallet screen", "Implement Wallet screen", "2020-04-21",
                "2020-04-25", arman, Task.Status.DONE, Task.Priority.MAJOR);
        Task task5 = new Task("Notifications screen", "Implement Notifications screen", "2020-04-24",
                "2020-04-30", tigran, Task.Status.INQA, Task.Priority.MINOR);
        Task task6 = new Task("Invite screen", "Implement Invite screen", "2020-03-30",
                "2020-04-29", ruben, Task.Status.OPEN, Task.Priority.MINOR);
        Task task7 = new Task("Social screen", "Implement Social screen", "2020-04-20",
                "2020-05-28", ruben, Task.Status.DONE, Task.Priority.MAJOR);
        Task task8 = new Task("Add Share Code screen", "Implement Add Share Code screen", "2020-03-20",
                "2020-03-28", smbat, Task.Status.DONE, Task.Priority.MINOR);
        Task task9 = new Task("Song ID screen", "Implement Song ID screen", "2020-02-10",
                "2020-02-18", tigran, Task.Status.INPROGRESS, Task.Priority.MAJOR);
        Task task10 = new Task("Profile screen", "Implement Profile screen", "2020-04-12",
                "2020-05-11", armen, Task.Status.OPEN, Task.Priority.CRITICAL);

        toDoList = new ArrayList<>();

        toDoList.add(task1);
        toDoList.add(task2);
        toDoList.add(task3);
        toDoList.add(task4);
        toDoList.add(task5);
        toDoList.add(task6);
        toDoList.add(task7);
        toDoList.add(task8);
        toDoList.add(task9);
        toDoList.add(task10);

        return toDoList;
    }
}
