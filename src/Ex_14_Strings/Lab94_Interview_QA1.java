package Ex_14_Strings;

public class Lab94_Interview_QA1 {
    public static void main(String[] args) {
        String S1= "Hello"; //these value are stored in the scp
        String S2 = "Hello";
        String S3 ="Hello";

        //Question :How may Strings are present in the SCP(String Constant Pool ) So Answer is 1 becasue it's value matches so there will be no new string

        String S4 = new String("Hello"); //these stored in the Object Area /Heap Area
        String S5 = new String ("Hello ");
        String S6 = new String("hello");

        //Question :How may Strings are present in the Object Area?
        //Ans : 3 Strings are Present in the OA

        // == Comparision but in the String we used it for Location  Referancewhere it is stored.

        System.out.println(S1==S3);
        System.out.println(S1==S5);
        System.out.println(S6==S5); //Here it's false because it's stored in the OA

        // equal (constant )-> check the value

        System.out.println(S1.equals(S5));
        System.out.println(S1.trim().equals(S5.trim()));
        System.out.println(S1.equalsIgnoreCase(S6));


    }
}
