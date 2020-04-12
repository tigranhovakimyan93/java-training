package homework1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeightOnMoon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight");
        try {
            float realWeight = scanner.nextFloat();
            if (realWeight <= 0) {
                System.out.println("Please enter a real weight");
            } else {
                float weightOnMoon = realWeight * 17 / 100;
                if (weightOnMoon - Math.round(weightOnMoon) == 0.0) {
                    System.out.println("Your weight on moon will be " + Math.round(weightOnMoon) + "kg");
                } else {
                    System.out.println("Your weight on moon will be " + weightOnMoon + "kg");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("You can enter only numbers");
        }
    }
}

