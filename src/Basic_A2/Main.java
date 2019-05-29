package Basic_A2;

import java.util.Arrays;

/**
 * Write a method  that takes as input two sorted arrays of numbers and returns an array which is the
 * combination of the two arrays, also sorted.
 */
public class Main {

    public static void main(String[] args) {

        int[] first = {1, 3, 5, 7, 9};
        int[] second = {2, 4, 6, 8, 10};


        int[] third = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, third, first.length, second.length);

        /*
        src − This is the source array.
        srcPos − This is the starting position in the source array.
        dest − This is the destination array.
        destPos − This is the starting position in the destination data.
        length − This is the number of array elements to be copied.
        */

        Arrays.sort(third);

        System.out.println(Arrays.toString(third));
    }
}
