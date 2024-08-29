package be.vsolutions.chapter1.question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Write a program that reads an integer and prints it in binary, octal,
         * and hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
         */
        var in = new Scanner(System.in);
        var i = in.nextInt();
//        var i = 10;
        var binaryString = Integer.toBinaryString(i); // no format specifiers found
        System.out.printf("binary:%s\n", binaryString); // s for string
        System.out.printf("octal:%o\n", i); // o for octal
        System.out.printf("hexadecimal:%x\n", i); // x for hexadecimal
        float f = i; // a conversion is nec (if not -> java.util.IllegalFormatConversionException)
        System.out.printf("hexadecimal floating point number:%a\n", f); // a for hexadecimal floating-point
    }
}
