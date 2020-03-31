import java.util.InputMismatchException;
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        try {
            int prime = scanner.nextInt();
            for (int i = 2; i <= (prime / 2); i++) {
                if (prime % i == 0) {
                    System.out.println("This is a not prime number");
                    return;
                }
            }
            System.out.println("This is a prime number");
        } catch (InputMismatchException e) {
            System.out.println("You can enter only natural numbers");
        }
    }
}

