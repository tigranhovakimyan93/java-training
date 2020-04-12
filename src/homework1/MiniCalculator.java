package homework1;

import java.util.Scanner;

public class MiniCalculator {


    private static Scanner scanner = new Scanner(System.in);

    private static char getSign() {
        System.out.println("Enter a sign");
        char sign;
        if (scanner.hasNext()) {
            sign = scanner.next().charAt(0);
        } else {
            System.out.println("Please enter a sign");
            scanner.next();
            sign = getSign();
        }
        return sign;
    }

//    private static double calc(int firstNumber, int secondNumber, Character sign) {
//        double result = 0;
//        switch (sign) {
//            case '+':
//                result = firstNumber + secondNumber;
//                break;
//            case '-':
//                result = firstNumber - secondNumber;
//                break;
//            case '*':
//                result = firstNumber * secondNumber;
//                break;
//            case '/':
//                result = (double) firstNumber / secondNumber;
//                break;
//            default:
//                System.out.println("Pelase try again");
//                result = calc(firstNumber, secondNumber, getSign());
//        }
//        return result;
//    }

    private static double calc(double firstNumber, double secondNumber, Character sign) {
        double result;
        switch (sign) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = (double) firstNumber / secondNumber;
                break;
            default:
                System.out.println("Pelase try again");
                result = calc(firstNumber, secondNumber, getSign());
        }
        return result;
    }

//    private static double calc(double firstNumber, int secondNumber, Character sign) {
//        double result = 0;
//        switch (sign) {
//            case '+':
//                result = firstNumber + secondNumber;
//                break;
//            case '-':
//                result = firstNumber - secondNumber;
//                break;
//            case '*':
//                result = firstNumber * secondNumber;
//                break;
//            case '/':
//                result = (double) firstNumber / secondNumber;
//                break;
//            default:
//                System.out.println("Pelase try again");
//                result = calc(firstNumber, secondNumber, getSign());
//        }
//        return result;
//    }

//    private static double calc(int firstNumber, double secondNumber, Character sign) {
//        double result;
//        switch (sign) {
//            case '+':
//                result = firstNumber + secondNumber;
//                break;
//            case '-':
//                result = firstNumber - secondNumber;
//                break;
//            case '*':
//                result = firstNumber * secondNumber;
//                break;
//            case '/':
//                result = firstNumber / secondNumber;
//                break;
//            default:
//                System.out.println("Pelase try again");
//                result = calc(firstNumber, secondNumber, getSign());
//        }
//        return result;
//    }

    public static void main(String[] args) {
        char sign;
        double result = 0;
        System.out.println("Enter a number");
        if (scanner.hasNextInt()) {
            int firstNumber = scanner.nextInt();
            System.out.println("Enter another number");
            if (scanner.hasNextInt()) {
                int secondNumber = scanner.nextInt();
                sign = getSign();
                result = calc(firstNumber, secondNumber, sign);
            } else if (scanner.hasNextDouble()) {
                double secondNumber = scanner.nextDouble();
                sign = getSign();
                result = calc(firstNumber, secondNumber, sign);
            }
        } else if (scanner.hasNextDouble()) {
            double firstNumber = scanner.nextDouble();
            System.out.println("Enter another number");
            if (scanner.hasNextInt()) {
                int secondNumber = scanner.nextInt();
                sign = getSign();
                result = calc(firstNumber, secondNumber, sign);
            } else if (scanner.hasNextDouble()) {
                double secondNumber = scanner.nextDouble();
                sign = getSign();
                result = calc(firstNumber, secondNumber, sign);
            }
        } else {
            System.out.println("zibil qez");
        }
        System.out.println("The result is " + result);
    }
}

