package homework1;

import java.util.Scanner;

public class MultiplicationTable {

    private static int userInput() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("You can enter only a number");
            scanner.next();
        }
        if (scanner.hasNextInt()) {
            firstNumber = scanner.nextInt();
        }
        return firstNumber;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        int firstNumber = MultiplicationTable.userInput();
        for (int secondNumber = 1; secondNumber < 10; secondNumber++) {
            int result = firstNumber * secondNumber;
            System.out.println(firstNumber + " X " + secondNumber + " = " + result);
            if (secondNumber == 9) {
                System.out.println("Please enter a number again");
                firstNumber = MultiplicationTable.userInput();
                secondNumber = 1;
            }
        }
    }
}
