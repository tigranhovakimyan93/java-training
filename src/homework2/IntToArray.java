package homework2;

import java.util.Scanner;


public class IntToArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a");
        int a = scanner.nextInt();
        String b = Integer.toString(a);
        char[] c = b.toCharArray();
        System.out.println(c);
    }
}
