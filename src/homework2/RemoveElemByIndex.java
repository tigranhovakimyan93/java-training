package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElemByIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = {0, 1, 2, 3, 4, 5, 6,};
        System.out.println("Enter an index");
        while (!scanner.hasNextInt()) {
            System.out.println("You can enter only natural numbers.");
            scanner.next();
        }
        int i = scanner.nextInt();
        if (i >= array1.length || i < 0) {
            System.out.println("Sorry, not existing index.");
        } else {
            int[] array2 = Arrays.copyOfRange(array1, i + 1, array1.length);
            array1 = Arrays.copyOf(array1, i);
            int[] tempArray = new int[array1.length + array2.length];
            System.arraycopy(array1, 0, tempArray, 0, array1.length);
            System.arraycopy(array2, 0, tempArray, array1.length, array2.length);
            System.out.println(Arrays.toString(tempArray));
        }
    }
}
