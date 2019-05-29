package Intermediate_A4;

import java.util.Arrays;

/**
 * Write a Java program  to sort an array of given integers using the Bubble sorting algorithm without the
 * usage of sort() methods offered by Java.
 */
public class Main {

    public static void main(String[] args) {

        int[] ints = {2, 5, 3, 8, 4, 9, 3};
        int help = 0;

        for (int i = 0; i < ints.length; i++) {
            for (int j = 1; j < (ints.length - i); j++) {

                if (ints[j - 1] > ints[j]) {
                    help = ints[j - 1];
                    ints[j - 1] = ints[j];
                    ints[j] = help;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
