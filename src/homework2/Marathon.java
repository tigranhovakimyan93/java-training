package homework2;

public class Marathon {

    private static String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John",
            "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
    private static int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

    private static int indexOfBiggest(int[] array) {
        int index = 0;
        int max = array[index];

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    private static int indexOfSecondBiggest(int[] array) {
        int index = 0;
        int secondMax = array[index];

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= secondMax && i != indexOfBiggest(times)) {
                secondMax = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println("1st Place - " + names[indexOfBiggest(times)] + " : " + times[indexOfBiggest(times)]);
        System.out.println("2nd Place - " + names[indexOfSecondBiggest(times)] + " : " + times[indexOfSecondBiggest(times)]);
    }
}
