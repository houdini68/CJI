package be.vsolutions.chapter1.question4;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /* 4. Write a program that prints the smallest and largest positive double values.
         * Hint: Look up Math.nextUp in the Java API.
         */
        System.out.println(Double.MAX_VALUE);
        Double largPos = Math.nextUp(Double.MAX_VALUE);
        System.out.println(largPos);
        Double smallPos = - Math.nextUp(Double.MAX_VALUE);
        System.out.println(smallPos);
    }
}
