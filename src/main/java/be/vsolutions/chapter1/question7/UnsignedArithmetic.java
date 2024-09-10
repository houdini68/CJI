package be.vsolutions.chapter1.question7;

import java.util.Scanner;

public class UnsignedArithmetic {
    public static void main(String[] args) {

        /*
         * 7. Write a program that reads in two integers between 0 and 4294967295,
         * stores them in int variables, and computes and displays their unsigned sum,
         * difference, product, quotient, and remainder.
         * Do not convert them to long values.
         */

        // Signed Integer Parsing
        int signedValue = Integer.parseInt("2147483647");
        System.out.println("Signed Value: " + signedValue); // Output: 2147483647

        // Unsigned Integer Parsing
        int unsignedValue = Integer.parseUnsignedInt("4294967295");
        System.out.println("Unsigned Value: " + unsignedValue); // Output: -1
        Scanner scanner = new Scanner(System.in);

        // Read two integers
        System.out.println("Enter the first integer (between 0 and 4294967295): ");
        int a = Integer.parseUnsignedInt(scanner.nextLine());

        System.out.println("Enter the second integer (between 0 and 4294967295): ");
        int b = Integer.parseUnsignedInt(scanner.nextLine());

        // Compute unsigned sum
        int unsignedSum = Integer.sum(a, b);
        System.out.println("Unsigned Sum: " + Integer.toUnsignedString(unsignedSum));

        // Compute unsigned difference
        int unsignedDifference = a - b;
        System.out.println("Unsigned Difference: " + Integer.toUnsignedString(unsignedDifference));

        // Compute unsigned product
        long unsignedProduct = Integer.toUnsignedLong(a) * Integer.toUnsignedLong(b);
        System.out.println("Unsigned Product: " + Long.toUnsignedString(unsignedProduct));

        // Compute unsigned quotient
        int unsignedQuotient = Integer.divideUnsigned(a, b);
        System.out.println("Unsigned Quotient: " + Integer.toUnsignedString(unsignedQuotient));

        // Compute unsigned remainder
        int unsignedRemainder = Integer.remainderUnsigned(a, b);
        System.out.println("Unsigned Remainder: " + Integer.toUnsignedString(unsignedRemainder));

        scanner.close();
    }
}
