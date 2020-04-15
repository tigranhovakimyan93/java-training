package homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialByRecursion {

    private static int factorial(int n) {
        int product = 1;
        if (n == 0 || n == 1) {
            return product;
        }
        product = n * factorial(n - 1);
        return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a natural number");
        try {
            int n = scanner.nextInt();
            if (n >= 0) {
                System.out.println("The factorial of " + n + " is " + factorial(n));
            } else {
                System.out.println("You can't count the factorial of a negative number.");
            }
        } catch (InputMismatchException e) {
            System.out.println("You can enter only a natural number.");
        }
    }
}
