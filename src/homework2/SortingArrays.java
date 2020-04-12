package homework2;

import java.util.Arrays;

public class SortingArrays {


    public static void main(String[] args) {
        double[] randomDoubleArray = new double[]{Math.random()};
        String s = Double.toString(randomDoubleArray[0]);
        int[] randomIntArray = s.replaceAll("\\D", "").chars().map(Character::getNumericValue).toArray();
        Arrays.sort(randomIntArray);
        System.out.println(Arrays.toString(randomIntArray));
        int temp;
        for (int i = 0; i < randomIntArray.length / 2; i++) {
            temp = randomIntArray[i];
            randomIntArray[i] = randomIntArray[randomIntArray.length - 1 - i];
            randomIntArray[randomIntArray.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(randomIntArray));
    }
}
