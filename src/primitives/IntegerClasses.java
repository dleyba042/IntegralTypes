package primitives;

public class IntegerClasses {

    public static void main(String[] args) {

        assignBinary();

    }

    public static void assignBinary(){
        //Integral types
        //bytes hold 8 bits

        byte byteOne = 0b0101_1111;
        System.out.println(byteOne);

        //16 bits in short
        short shortOne = 0b0111_0000_1111_1010;
        System.out.println(shortOne);

        //32 bits in int
        int intOne = 0b0100_0000_0000_0000_1111_1111_1111_0000;
        System.out.println(intOne);

        //64 bits in long
        long  longOne = 0b0100_0000_1010_0000_1111_0000_0000_1111;
        System.out.println(longOne);

    }

    public static void assignHex(){


    }
}
