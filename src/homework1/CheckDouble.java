package homework1;

import java.util.Scanner;

public class CheckDouble {

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextDouble()) {
            System.out.println("This is not double");
        } else {
            System.out.println("This is double");
        }
    }
}
