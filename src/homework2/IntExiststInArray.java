package homework2;

import java.util.Scanner;

public class IntExiststInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        int a = scanner.nextInt();
        for (int value : array) {
            if (value == a) {
                System.out.println("exists in array");
                System.exit(1);
            }
        }
        System.out.println("does not exist in array");
    }
}

