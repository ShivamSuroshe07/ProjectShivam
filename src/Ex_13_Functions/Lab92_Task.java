package Ex_13_Functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab92_Task {
    //Problem Statement Take Input form the user and create a function of add, sub , Mul and div with Parameter a, b
    public static void main(String[] arg) {

//Logic Building
        //Step1 ->Input and Outputs
        //Input int and Output int
        //step 2 Rough logic ->created the fucntions
        //step 3 write the code and find the fix ->edge cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = 0;
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
        }
        else{
            System.out.println("Enter the int only");
            System.exit(0);
        }

        System.out.println("Enter the num2");
        int b = 0;
        if(scanner.hasNextInt()){
            b = scanner.nextInt();
        }
        else{
            System.out.println("Enter the int only");
            System.exit(0);
        }

        int result_sum = add(a,b);
        int result_sub = sub( a,b);
        int result_multi =Multiply(a,b);
        int result_divi =division(a,b);
        int result_mod = Mod(a,b);
        System.out.println("Enter the sum" +result_sum);
        System.out.println("Enter the substraction" +result_sub);
        System.out.println("Enter the multiply" +result_multi);
        System.out.println("Enter the modules" + result_mod);
        System.out.println("Enter the Division" + result_divi);

    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int Multiply(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) {
        if (b==0){
            System.out.println("Div by zero not allowed");
            return 0; //return some safe value
        }
        return a/b;
    }
    static int Mod(int a, int b) {
        if (b==0){
            System.out.println("Div by modules not allowed");
            return 0;
        }
        return a%b;
    }
}





