package homework2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class IntToArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int enteredNumber = scanner.nextInt();
        String string = Integer.toString(enteredNumber);
        int[] newArray = new int[string.length()];
        for (int i = 0; i < string.length(); i++) {
            newArray[i] = Character.getNumericValue(string.charAt(i));
        }
        System.out.println("Answer:" + "\n" + Arrays.toString(newArray));
    }
}
