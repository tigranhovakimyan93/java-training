package homework3;

import java.util.Arrays;

public class RemoveLongElems {

    private static String[] noLong(String[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() != 4) {
                array[index++] = array[i];
            }
        }
        return Arrays.copyOf(array, index);
    }

    public static void main(String[] args) {
        String[] array = {"this", "not", "too", "long"};
        System.out.println(Arrays.toString(RemoveLongElems.noLong(array)));
    }
}
