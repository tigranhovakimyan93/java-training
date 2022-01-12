package homework6.userManager;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class UserManagerAPI {

    static File createUsersFile(ArrayList<User> userList) {
        File file = new File("resources/userList.txt");
        try (FileOutputStream out = new FileOutputStream(file);
             ObjectOutputStream writeUser = new ObjectOutputStream(out)) {
            for (User user : userList) {
                writeUser.writeObject(user);
            }
        } catch (Exception e) {
            System.out.println("Something wrong with file.");
        }
        return file;
    }

    static ArrayList<User> getUserArrayListFromFile(File file) {
        ArrayList<User> userArrayList = new ArrayList<>();

        try (FileInputStream in = new FileInputStream(file);
             ObjectInputStream readUser = new ObjectInputStream(in)) {
            while (true) {
                userArrayList.add((User) readUser.readObject());
            }
        } catch (EOFException e) {
            // End of stream
        } catch (ClassNotFoundException e) {
            System.out.println("Can not cast objects from file to user.");
        } catch (IOException e) {
            System.out.println("Something wrong with file.");
        }
        return userArrayList;
    }

    static void doCommand(ArrayList<User> userList) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("EXIT")) {
            switch (command) {
                case "ADD":
                    addUser(userList, scanner);
                    break;
                case "REMOVE":
                    removeUser(userList, scanner);
                    break;
                case "LIST":
                    listUsers(userList);
                    break;
                default:
                    System.out.print("Wrong command. ");
                    break;
            }
            System.out.println("Enter another command:");
            command = scanner.nextLine();
        }
        try (FileOutputStream out = new FileOutputStream("resources/userList.txt");
             ObjectOutputStream writeUser = new ObjectOutputStream(out)) {
            for (User user : userList) {
                writeUser.writeObject(user);
            }
            System.out.println("All changes have been saved.");
        } catch (Exception e) {
            System.out.println("Something wrong with file.");
        }
    }

    private static void listUsers(ArrayList<User> userList) {
        if (userList.size() > 0) {
            System.out.println("Here are all users:");
            for (User user : userList) {
                System.out.println("Username = " + user.getUsername() + ", age = " + user.getAge());
            }
        } else {
            System.out.println("The user list is empty. There is no user to display.");
        }
    }

    private static void removeUser(ArrayList<User> userList, Scanner scanner) {
        if (userList.size() > 0) {
            System.out.println("Please enter a username to delete the user:");
            String enteredUsername = scanner.nextLine();

            for (int i = 0; i < userList.size(); i++) {
                if (userList.get(i).getUsername().equals(enteredUsername)) {
                    userList.remove(userList.get(i));
                    System.out.println("The user is removed.");
                    return;
                }
            }
            System.out.println("There is no user with this username, enter a username again:");
        } else {
            System.out.println("The user list is empty. There is no user to remove.");
        }
    }

    private static void addUser(ArrayList<User> userList, Scanner scanner) {
        System.out.println("Please enter a username for the new user:");
        String enteredUsername = scanner.nextLine();
        for (int i = 0; i < userList.size(); i++) {
            while (userList.get(i).getUsername().equals(enteredUsername)) {
                System.out.println("This username is already taken, enter another username:");
                i = 0;
                enteredUsername = scanner.nextLine();
            }
        }
        System.out.println("Please enter an age for the new user:");
        int enteredAge = enterAge();
        User user = new User(enteredUsername, enteredAge);
        userList.add(user);
        System.out.println("New user is created.");
    }

    private static int enterAge() {
        Scanner scanner = new Scanner(System.in);
        int enteredNumber = 0;
        do {
            try {
                enteredNumber = scanner.nextInt();
                if (enteredNumber <= 0) {
                    System.out.println("Please enter only a positive number:");
                }
            } catch (InputMismatchException a) {
                System.out.println("You can enter only numbers. Please enter a number:");
                scanner.next();
            }
        } while (enteredNumber <= 0);

        return enteredNumber;
    }
}