package com.pre.java8.language_fund;

/**
 * Created by udoluweera on 3/1/17.
 */
public class DifferentBaseTypes {

    /**
     * Different base types
     * Can be assigned to any integer literal type
     * When the base is different it will display a different value base on decimal
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Octal
         * Starts with Zero and goes to 7
         */
        int octalLiteral = 0127;
        System.out.println("Octal Int: " + octalLiteral);

        double octalInDouble = 01234567;
        System.out.println("Octal Double: " + octalInDouble);


        /**
         * Hexadecimal - 0x or 0X A - F
         */
        int hexadecimalValue = 0X8abcdef;
        long hexaLongValue = 0x1234567f;
        System.out.println("HexaLong: "+ hexaLongValue);

        /**
         * Binary - 0B or 0b - 0 and 1
         */
        int binaryValue = 0b1010101;
        short binary = 0B001010101;
        System.out.println("Binary : " + binary);
    }

}
