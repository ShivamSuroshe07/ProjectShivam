package Ex_17_Arrays;

import java.lang.reflect.Array;

public class Lab_98_ArryMaxValue {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};//Max and Min

        // Logic Building
        //Inputs already given Array ->Int
        //Max77 and Min14 ->Int
        //rough logic  ->we are here comparing the values using the for loop.
        int max_output = max_value(array);
        System.out.println(max_output);
        int min_output = min_value(array);
        System.out.println(min_output);
    }

    static int max_value(int[] array) {
        int max = array[0];//25

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }

         return max;
    }
    static int min_value(int [] array){
        int min = array[0];
        for (int i =0 ; i< array.length ; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }


}