package Exceptions;

import java.util.*;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Numerator: ");
        int a = sc.nextInt();

        System.out.println("Enter the Denominator:");
        int b = sc.nextInt();

        try {
            int result = a / b;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        sc.close();

    }
}
