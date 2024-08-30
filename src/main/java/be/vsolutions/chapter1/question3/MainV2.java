package be.vsolutions.chapter1.question3;

public class MainV2 {
    public static void main(String[] args) {
        /* Using only the conditional operator, write a program that reads
         * three integers and prints the largest. Repeat with Math.max.
         */
        int i1 = 99;
        int i2 = 25;
        int i3 = 19;
        int max;
        max = Math.max(i1, i2);
        max = Math.max(max, i3);
        System.out.printf("max V2:%d ",max);
    }
}
