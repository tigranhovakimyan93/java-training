package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class IncreaseByTenPercent {

    private static double[] addTenPercents(int index, double[] array) {
        array[index] = array[index] + array[index] * 10 / 100;
        return array;
    }

    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, -1, 22};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Initial array: " + Arrays.toString(array));
        System.out.println("Enter an index:");
        while (!scanner.hasNextInt()) {
            System.out.println("You can enter only natural numbers");
            scanner.next();
        }
        int index = scanner.nextInt();
        if (index >= array.length || index < 0) {
            System.out.println("Sorry, not existing index");
        } else {
            System.out.println("Increasing the number in index " + index + " by 10%:" + "\nThe answer is: " + IncreaseByTenPercent.addTenPercents(index, array)[index]);
        }
    }
}