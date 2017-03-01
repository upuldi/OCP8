package com.pre.java8.formatting;

import java.text.DecimalFormat;

/**
 * Created by udoluweera on 3/1/17.
 */
public class DecimalFormatFlags {

    public static void main(String[] args) {

        /**
         * Creation - Use constructor
         *
         * # -omit position
         * 0 - Add zeros
         *
         */

        double d = 1234.56789;
        DecimalFormat decimalFormatWithHash = new DecimalFormat("###,###,###.##");
        System.out.println("Rounded Response at end: " + decimalFormatWithHash.format(d)); // The response get rounded at the end

        /**
         * Even though it rounds the decimal points, it does not try to change value before it
         */
        DecimalFormat checkValueRound = new DecimalFormat("##.###");
        System.out.println("Round check before the dot: " + checkValueRound.format(d));

        /**
         * It does not put a comma in the beginning of the formatted string,
         */
        DecimalFormat checkPattern = new DecimalFormat("##,####.###");
        System.out.println("Pattern Check: " + checkPattern.format(d));

        DecimalFormat zeroTest = new DecimalFormat(",00.00");
        System.out.println("Zero Test: " + zeroTest.format(d));

    }
}
