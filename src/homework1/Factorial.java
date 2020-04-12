package homework1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number");
        try {
            int enteredNumber = scanner.nextInt();
            int factorial = 1;
            if (enteredNumber <= 0) {
                System.out.println("Please enter only natural numbers");
            } else {
                for (int i = 1; i <= enteredNumber; i++) {
                    factorial *= i;
                }
                System.out.println("The factorial of " + enteredNumber + " is " + factorial);
            }
        } catch (InputMismatchException e) {
            System.out.println("You can enter only numbers");
        }
    }
}
