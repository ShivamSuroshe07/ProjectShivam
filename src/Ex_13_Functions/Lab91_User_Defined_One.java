package Ex_13_Functions;

import java.util.Scanner;

public class Lab91_User_Defined_One {
    public static void main(String [] arg) {
        //step 2 is calling the function
        String s = Date_New();
        System.out.println(s);
        int z =age_to_vote();
        System.out.println("Age to Vote is "+z);
        your_name("Shivam");

        Scanner sc = new Scanner(System.in);
        System.out. println("Enter value of a: ");
        int a =sc.nextInt();
        System.out. println("Enter value of b: ");
        int b =sc.nextInt();
        System.out. println("Enter value of c: ");
        int c =sc.nextInt();
        int result = sum_of_three_Numbers(a,b,c);
        System.out.println("The sum of all three numbers is " + result);
    }

    //Step1 declarion /define
    static String Date_New(){
        return "Hi I am shivam, what's your new date";
    }
    static int age_to_vote(){
        return 18;
    }
    static void your_name(String name){
        System.out.println("Hi your name is " +name);
    }
    static int sum_of_three_Numbers (int a , int b, int c)
    { return a+b+c;
    }
}
