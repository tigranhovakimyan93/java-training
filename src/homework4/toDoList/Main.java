package homework4.toDoList;

import homework4.library.Utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Task> toDoList = ToDoListProvider.getData();
        System.out.println(ToDoListAPI.getTaskTitles(toDoList));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a status");
        String enteredStatus = scanner.nextLine();
        String enteredStatusUppercase = enteredStatus.substring(0, 1).toUpperCase() + enteredStatus.substring(1);
        if (ToDoListAPI.getTaskByStatus(toDoList, enteredStatus).size() == 0) {
            System.out.println("No tasks by this status.");
        } else {
            System.out.println("Here are the tasks by status " + enteredStatusUppercase + ": \n" + ToDoListAPI.getTaskByStatus(toDoList, enteredStatus));
        }

        System.out.println("Please enter a priority");
        String enteredPriority = scanner.nextLine();
        String enteredPriorityUppercase = enteredPriority.substring(0, 1).toUpperCase() + enteredPriority.substring(1);
        if (ToDoListAPI.getTaskByPriority(toDoList, enteredPriority).size() == 0) {
            System.out.println("No tasks by this priority.");
        } else {
            System.out.println("Here are the tasks by priority " + enteredPriorityUppercase + ": \n" + ToDoListAPI.getTaskByPriority(toDoList, enteredPriority));
        }

        System.out.println("Please enter a user name");
        String enteredAssign = scanner.nextLine();
        String enteredName = enteredAssign.substring(0, 1).toUpperCase() + enteredAssign.substring(1);
        if (ToDoListAPI.getTaskByAssign(toDoList, enteredAssign).size() == 0) {
            System.out.println("No tasks assigned to this user.");
        } else {
            System.out.println("Here are the tasks assigned to " + enteredName + ": \n" + ToDoListAPI.getTaskByAssign(toDoList, enteredAssign));
        }

        System.out.println("Here are all not finished tasks:" + "\n" + ToDoListAPI.removeDoneTasks(toDoList));

        System.out.println("Please enter a date in this format: yyyy-MM-dd");
        String enteredDate = scanner.nextLine();
        Date date = Utils.parseDate(enteredDate);
        System.out.println("Here are the tasks which should be completed before " + enteredDate + ":\n" + ToDoListAPI.getTasksByEndDate(toDoList, date));

    }
}
