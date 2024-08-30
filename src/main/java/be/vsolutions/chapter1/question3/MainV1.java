package be.vsolutions.chapter1.question3;

public class MainV1 {
    public static void main(String[] args) {
        /* Using only the conditional operator, write a program that reads
         * three integers and prints the largest. Repeat with Math.max.
         */
        int i1 = 1;
        int i2 = 15;
        int i3 = 19;
        int max;
        if(i1 > i2 && i1 > i3) {
            max = i1;
        } else if(i2 > i3) {
            max = i2;
        } else {
            max = i3;
        }
        System.out.printf("max V1:%d ",max);
    }
}
