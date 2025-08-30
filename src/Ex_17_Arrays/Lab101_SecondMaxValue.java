package Ex_17_Arrays;

import java.util.Arrays;

public class Lab101_SecondMaxValue {
    public static void main(String[] args) {
        //find the second the largest number in the array
        int [] numbers = {12,34,10,1};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
