package Ex_17_Arrays;

import java.util.Arrays;

public class Lab_97_ArrayExample {
    public static void main(String[] args) {
        int[] Grade = {1, 2, 6, 8, 9};
        System.out.println(Grade.length);
         for (int i =0; i<Grade.length ; i++) {
             System.out.println(Grade[i]);
         };
         Arrays.sort(Grade);
        System.out.println(Grade);

        int[] Marks = new int[6];  //This is fixed size
        System.out.println(Marks);
        //“Printing an array directly in Java prints its type + hashcode, not the elements.
        // To see the values, we should use a loop or Arrays.toString().
        System.out.println(Arrays.toString(Marks));

        Marks[0] = 10;
        Marks[1] = 15;
        Marks[2] = 25;
        Marks[3] = 30;
        Marks[4] = 40;
        Marks[5] = 50;
        System.out.println(Marks[3]);


        String[] students = {"Shivam", "Gajakumar", "Akash", "Nikhil"};
        System.out.println(students.length);

        String [] Member = new String[2];//bydefault value is Null
        System.out.println(Arrays.toString(Member));

        boolean [] QA =new boolean[3]; //bydefault value is false
        System.out.println(Arrays.toString(QA));

        float [] dev = new float[2]; // //bydefault value is 0.0
        System.out.println(Arrays.toString(dev));


    }
}
