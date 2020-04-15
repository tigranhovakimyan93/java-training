package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class IncreaseByTenPercent {

    private static float [] addTenPercents(int index, float[] array) {
        array[index] = array[index] + array[index]*10/100;
        return array;
    }

    public static void main(String[] args) {
        float[] array = {1, 2, 3, 4, -1, 22};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an index");
        while (!scanner.hasNextInt()) {
            System.out.println("You can enter only natural numbers");
            scanner.next();
        }
        int index = scanner.nextInt();
        if (index >= array.length || index < 0) {
            System.out.println("Sorry, not existing index");
        } else {
            System.out.println(Arrays.toString(IncreaseByTenPercent.addTenPercents(index,array)));
            System.out.println("The answer is: " + array[index]);
        }
    }
}