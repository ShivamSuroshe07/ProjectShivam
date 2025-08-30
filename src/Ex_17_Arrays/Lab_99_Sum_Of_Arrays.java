package Ex_17_Arrays;

public class Lab_99_Sum_Of_Arrays {
    public static void main(String[] args) {
        int [] numbers ={12,34,10};

        int sum =0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum +numbers[i];

            //Alternative way foreach loop (only words with the array and Collection)
          for ( int n :numbers){
              sum = sum + n ;
          }
            System.out.println(sum);
        }

    }


}
