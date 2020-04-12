package homework2;

import java.util.Arrays;

public class IntSorterInArray {

    private static int[] even(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        arr = Arrays.copyOf(arr, index);
        return arr;
    }

    private static int[] odd(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] != 0)
                arr[index++] = arr[i];
        }
        arr = Arrays.copyOf(arr, index);
        return arr;
    }

    private static int[] prime(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]) && arr[i] != 0)
                arr[index++] = arr[i];
        }
        arr = Arrays.copyOf(arr, index);
        return arr;
    }

    private static boolean isPrime(int a) {
        for (int i = 2; i <= (a / 2); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        double[] array = {Math.random()};
        String s = Double.toString(array[0]);
        int[] arrayForEven = s.replaceAll("\\D", "").chars().map(Character::getNumericValue).toArray();
        int[] arrayForOdd = Arrays.copyOf(arrayForEven, arrayForEven.length);
        int[] arrayForPrime = Arrays.copyOf(arrayForEven, arrayForEven.length);
        System.out.println("Even numbers: " + Arrays.toString(even(arrayForEven)));
        System.out.println("Odd numbers: " + Arrays.toString(odd(arrayForOdd)));
        System.out.println("Prime numbers: " + Arrays.toString(prime(arrayForPrime)));
    }
}
