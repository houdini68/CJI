package be.vsolutions.chapter1.question2;

public class MainV1 {
    /*
     * Write a program that reads an integer angle (which may be positive
     * or negative) and normalizes it to a value between 0 and 359
     * degrees. Try it first with the % operator, then with floorMod.
     */
    public static void main(String[] args) {
//        int degree = -450;
//        int degree = -120;
//        int degree = 0;
//        int degree = 360;
        int degree = 120;
//        int degree = 450;
        int normalized;
        if(degree > 0)
            normalized = degree % 360;
        else
            normalized = -degree % 360;
        System.out.println(normalized);
    }
}
