package be.vsolutions.chapter1.question5;

public class Main {
    /*
     * 5. What happens when you cast a double to an int that is larger than the largest possible int value?
     * Try it out.
     */
    public static void main(String[] args) {
        double maxDouble = Double.MAX_VALUE;
        System.out.println(maxDouble);
        int maxInt = (int) maxDouble; // cast needed
        System.out.println(maxInt); // truncation and no compile or exec error
    }
}
