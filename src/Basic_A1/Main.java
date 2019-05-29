package Basic_A1;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 6, 8, 1, 4, 9, 3, 0, 7};

        java.util.Arrays.sort(numbers);

        System.out.println(java.util.Arrays.toString(numbers));

        System.out.println("The two biggest numbers are " + numbers[numbers.length-2] + " and " + numbers[numbers.length-1]);
        
    }
}
