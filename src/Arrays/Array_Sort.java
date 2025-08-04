package Arrays;

import java.util.Arrays;

public class Array_Sort {
    public static void main(String[] args) {
        int[] numbers= {2,67,56,36,98,61};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]); //numbers.length-2 denotes 2nd largest number

    }
}
