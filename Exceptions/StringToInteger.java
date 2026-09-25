package Exceptions;

import java.util.*;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String str = sc.nextLine();

        try {
            int number = Integer.parseInt(str);
            System.out.println("Converted number= " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Enter a valid integer.");
        }

    }
}
