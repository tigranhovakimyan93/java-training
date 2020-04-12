package homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageOfDoubles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] d = new double[10];
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter a double");
                d[i] = scanner.nextDouble();
            }
            double sum = 0;
            for (double i : d) {
                sum += i;
            }
            System.out.println("The average is: " + sum / 10);

        } catch (InputMismatchException e) {
            System.out.println("yaxq ara");
        }
    }
}

