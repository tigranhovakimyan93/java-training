package homework2;

import java.util.Arrays;

public class RepeatingElems {

    public static void main(String[] args) {
        int[] firstArray = {1, 45, 6, 72};
        int[] secondArray = {3, 4, 45, 71, 1};
        int index = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    firstArray[index++] = secondArray[j];
                    break;
                }
            }
        }
        firstArray = Arrays.copyOf(firstArray, index);
        Arrays.sort(firstArray);

        if (firstArray.length > 2) {
            int newIndex = 0;
            int current = firstArray[0];
            for (int k = 0; k < firstArray.length - 1; k++) {
                if (current != firstArray[k + 1]) {
                    firstArray[newIndex++] = firstArray[k];
                }
                current = firstArray[k];
            }
            firstArray = Arrays.copyOf(firstArray, newIndex);
        }
        System.out.println(Arrays.toString(firstArray));
    }
}
