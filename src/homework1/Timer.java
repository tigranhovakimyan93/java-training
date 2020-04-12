package homework1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Timer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of seconds");
        try {
            int seconds;
            seconds = scanner.nextInt();
            if (seconds < 0) {
                System.out.println("You can't enter negative numbers");
            } else {
                TimeUnit.SECONDS.sleep(seconds);
                System.out.println("End");
            }
        } catch (InputMismatchException | InterruptedException e) {
            System.out.println("You can enter only numbers");
        }
    }
}
