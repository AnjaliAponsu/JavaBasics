public class Main {
    public static void main(String[] args) {
        //byte numbers(small integers, -128 to 127)
        byte bytenum = 127;
        System.out.println("Byte value: " + bytenum);

        //short (medium integers, -32,768 to 32,767)
        short shortnum = 32000;
        System.out.println("Short value: " + shortnum);

        //int (default integer, -2 billion to 2 billion)
        int intnum = 2000000000;
        System.out.println("Integer value: " + intnum);

        //long (very large integers)
        long big = 10000000000L; // must add L at the end
        System.out.println("Long value: " + big);

        //float (decimal numbers, single precision)
        float f = 3.14f;  // must add f
        System.out.println("Float value: " + f);

        //double (decimal numbers, double precision, default for decimals)
        double d = 99.99;
        System.out.println("Double value: " + d);

        //boolean (true or false)
        boolean isJavaFun = true;
        System.out.println("Boolean value: " + isJavaFun);

        //char (single character, uses single quotes ' ')
        char letter = 'A';
        System.out.println("Char value: " + letter);

    }
}