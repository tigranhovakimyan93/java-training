package homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {

    private static int fibonacciNumber(int n) {
        int number = 0;
        if (n == 0) {
            return number;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        number = fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a natural number:");
        try {
            int n = scanner.nextInt();
            if (n >= 0) {
                System.out.println("The answer is " + fibonacciNumber(n) + ".");
            } else {
                System.out.println("You can't enter negative numbers.");
            }
        } catch (InputMismatchException e) {
            System.out.println("You can enter only a natural number.");
        }
    }
}
