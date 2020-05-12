package homework3;

import java.util.Arrays;

public class CopyingElems {

    private static String[] copies3(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + array[i] + array[i];
        }
        return array;
    }

    public static void main(String[] args) {
        String[] array = {"a", "bb", "ccc"};
        System.out.println("Initial array: " + Arrays.toString(array));
        System.out.println("New array with 3*copied elements:" + Arrays.toString(CopyingElems.copies3(array)));
    }
}

