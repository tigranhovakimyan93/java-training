package homework4.toDoList;

import homework4.library.Utils;

import java.util.ArrayList;
import java.util.Date;

class ToDoListAPI {

    static ArrayList<String> getTaskTitles(ArrayList<Task> toDoList) {
        ArrayList<String> tempList = new ArrayList<>();
        for (Task task : toDoList) {
            tempList.add(task.getTitle());
        }
        return tempList;
    }

    static ArrayList<String> getTaskByStatus(ArrayList<Task> toDoList, String enteredStatus) {
        ArrayList<String> tempList = new ArrayList<>();
        for (Task task : toDoList) {
            if (task.getStatus().toString().equalsIgnoreCase(enteredStatus)) {
                tempList.add(task.getTitle());
            }
        }
        return tempList;
    }

    static ArrayList<String> getTaskByPriority(ArrayList<Task> toDoList, String enteredPriority) {
        ArrayList<String> tempList = new ArrayList<>();
        for (Task task : toDoList) {
            if (task.getPriority().toString().equalsIgnoreCase(enteredPriority)) {
                tempList.add(task.getTitle());
            }
        }
        return tempList;
    }

    static ArrayList<String> getTaskByAssign(ArrayList<Task> toDoList, String enteredAssign) {
        ArrayList<String> tempList = new ArrayList<>();
        for (Task task : toDoList) {
            if (task.getAssign().getName().equalsIgnoreCase(enteredAssign)) {
                tempList.add(task.getTitle());
            }
        }
        return tempList;
    }

    static ArrayList<String> removeDoneTasks(ArrayList<Task> toDoList) {
        ArrayList<String> tempList = new ArrayList<>();
        for (Task task : toDoList) {
            if (task.getStatus() != Task.Status.DONE) {
                tempList.add(task.getTitle());
            }
        }
        return tempList;
    }

    static ArrayList<String> getTasksByEndDate(ArrayList<Task> toDoList, Date enteredDate) {
        ArrayList<String> tempList = new ArrayList<>();
        for (Task task : toDoList) {
            if (Utils.parseDate(task.getEndDate()).before(enteredDate)) {
                tempList.add(task.getTitle());
            }
        }
        return tempList;
    }
}