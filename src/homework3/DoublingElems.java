package homework3;

import java.util.Arrays;

public class DoublingElems {

    private static int[] doubling(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, -1, 22};
        System.out.println("Initial array: " + Arrays.toString(array));
        System.out.println("New array with doubled elements: " + Arrays.toString(DoublingElems.doubling(array)));
    }
}
