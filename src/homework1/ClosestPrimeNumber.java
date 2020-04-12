package homework1;

import java.util.Scanner;

public class ClosestPrimeNumber {

    private static Scanner scanner = new Scanner(System.in);

    private static int prime() {
        int enteredNumber = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a natural number");
            scanner.next();
        }
        if (scanner.hasNextInt()) {
            enteredNumber = scanner.nextInt();
            for (int i = 2; i <= (enteredNumber / 2); i++) {
                if (enteredNumber % i == 0) {
                    enteredNumber++;
                }
            }
            return enteredNumber;
        }
        return enteredNumber;
    }

    public static void main(String[] args) {
        System.out.println("Enter a natural number");
        while (true) {
            int number = prime();
            if (number == 0) {
                System.out.println("bye bye");
                System.exit(0);
            }
            System.out.println("The answer is: " + number);
        }
    }
}
