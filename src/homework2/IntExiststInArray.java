package homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntExiststInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        try {
            int a = scanner.nextInt();
            for (int value : array) {
                if (value == a) {
                    System.out.println("Exists in array.");
                    System.exit(1);
                }
            }
            System.out.println("Does not exist in array.");
        } catch (InputMismatchException e) {
            System.out.println("You can enter only numbers.");
        }
    }
}

