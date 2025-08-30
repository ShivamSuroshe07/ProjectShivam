package Ex_15_String_Functions;

public class Lab95_Different_Types {
    public static void main(String[] args) {
        String N = "Shivam ";
        String N1= "shivam";
          String N2 = "suroshe";
          String N3 ="Is genius";
          //1.CharAt
        //System.out.println(N.charAt(3));
        //System.out.println(N.charAt(10)); it will throw exception Index 10 out of bounds for length 6
        //System.out.println(N.charAt(-1));it will throw exception Index 10 out of bounds for length 6
        System.out.println(N.charAt(0));

        //2.Length  ( Count for Space is also included )
        System.out.println(N.length());

        //3.concat
        System.out.println(N.concat(N2));
        System.out.println(N2.concat(N.concat(N3.concat("Nice"))));

        //4.Contains //return true if and only if this string contain the sepecified sequence of the char value
        System.out.println(N.contains(""));

        //5.equals() check the values mean comparing the values
        System.out.println(N.equals(N2));

        //6.equalignorecase it just ignore the case

        //7.Indexof() it's gives the index number within the string of the occurance of the specifed charc
        //and if the char is not present in the string then it will return to us is -1
        //it alaesy shows the first occurance

        System.out.println(N.indexOf("d")); //retures -1 as no char is present
        System.out.println(N2.indexOf("s")); // returens index of the first s

        //8.Replace Return a string resulting form replacing all occurance of the old char  in this string with new char.
        System.out.println(N3.replace("genius","Good"));

        //9.split
        String word = "I am learing Java";
        String [] text =word.split( " ");
        for (String t : text) {
            System.out.println(t);
        }

        //Important : if we use  System.out.println(text);
        //you’re trying to print the array object itself, not its contents.
        //So Java will print something like:
        //
        //arduino
        //Copy code
        //[Ljava.lang.String;@6d06d69c

        //10.substring extracts a portion of the string

        String Good = "Testing Application ";
        System.out.println(Good.substring(4,10));
        //11.Lowercase
        //12.uppercase
        //13.Startwith()
        System.out.println(Good.startsWith("T"));
        //14.endwith()
        System.out.println(Good.endsWith("n"));
        //15.trim()
        System.out.println(Good.trim());
        //16.compareTo ()
        System.out.println(N.compareTo(N1));

        //17.append using the Stringbuilder
        //1. String (with concat()
        //String objects in Java are immutable → once created, their value cannot change.
        //The concat() method joins two strings and returns a new String object.
        //StringBuilder (with append())
        //StringBuilder objects are mutable → they can be changed without creating new objects.
        //The append() method directly modifies the existing object.

        StringBuilder SC = new StringBuilder("Hello");
        SC.append(" it's mt world");
        System.out.println(SC.toString());
//append() always needs something inside (string/char/int/etc.).
//If you just want to see the content, print the StringBuilder object directly → System.out.println(SC);
    }

}
