package homework3;

import java.util.Arrays;

public class ActionsWithTwoArrays {

    private static int[] sumArrays(int[] array1, int[] array2) {
        int[] tempArray = new int[array1.length + array2.length];
        for (int i = 0; i < tempArray.length; i++) {
            if (i < array1.length) {
                tempArray[i] = array1[i];
            } else {
                for (int j = 0; j < array2.length; j++) {
                    tempArray[i++] = array2[j];
                }
            }
        }
        return tempArray;
    }

    private static int sumArithmetic(int[] array1, int[] array2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }
        return sum1 / array1.length + sum2 / array2.length;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10, 11, 12};

        System.out.println(Arrays.toString(ActionsWithTwoArrays.sumArrays(array1, array2)));
        System.out.println(sumArithmetic(array1, array2));
    }
}

