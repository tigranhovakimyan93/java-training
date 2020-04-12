package homework3;

import java.util.Arrays;

public class RemoveX {

    private static String[] noX(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].replaceAll("x", "");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] array = {"xxax", "xbxbx", "xxcx"};
        System.out.println(Arrays.toString(RemoveX.noX(array)));
    }
}
