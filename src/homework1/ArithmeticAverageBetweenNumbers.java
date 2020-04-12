package homework1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticAverageBetweenNumbers {


    private float arithmetic(int a, int b, float sum) {
        return sum / (b - a - 1);
    }

    private int summary(int a, int b) {
        int sum = 0 - a;
        for (; a < b; a++) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticAverageBetweenNumbers arithmeticAverageBetweenNumbers = new ArithmeticAverageBetweenNumbers();
        int a, b;
        System.out.println("Please enter a");
        try {
            a = scanner.nextInt();
            System.out.println("Please enter b");
            b = scanner.nextInt();
            if (a + 1 < b) {
                int summary = arithmeticAverageBetweenNumbers.summary(a, b);
                float arithmetic = arithmeticAverageBetweenNumbers.arithmetic(a, b, summary);
                System.out.println("The summary of the numbers between a and b is " + summary + ".");
                if (arithmetic - Math.round(arithmetic) == 0.0)
                    System.out.println("The arithmetic average of the numbers beteen a and be is " + Math.round(arithmetic) + ".");
                else {
                    System.out.println("The arithmetic average of the numbers beteen a and be is " + arithmetic + ".");
                }
            } else {
                System.out.println("zibil qez");
            }
        } catch (InputMismatchException e) {
            System.out.println("zibil qez");
        }
    }
}
