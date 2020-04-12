package homework2;

import java.util.Arrays;

public class MatrixToArray {

    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3, 4},
                {3, 2, 1}};
        int[] array = new int[7];
        int k = 0;
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                array[k] = matrixA[i][j];
                k++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

