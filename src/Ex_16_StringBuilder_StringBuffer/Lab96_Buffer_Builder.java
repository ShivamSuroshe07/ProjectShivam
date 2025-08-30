package Ex_16_StringBuilder_StringBuffer;

public class Lab96_Buffer_Builder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("Shivam");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());

        StringBuffer de = new StringBuffer("What is your");
        de.reverse();
        System.out.println(de);
    }
}
