package homework2;

public class MaxMinInArray {

    private static int[] array = {1, 2, 44, -4, 5, 7, 343, 9, 0, 7, 10, 55};

    private static int maxElem(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[0]) {
                array[0] = array[i];
            }
        }
        return array[0];
    }

    private static int minElem(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[0]) {
                array[0] = array[i];
            }
        }
        return array[0];
    }

    public static void main(String[] args) {
        System.out.println(minElem(array));
        System.out.println(maxElem(array));
    }
}
