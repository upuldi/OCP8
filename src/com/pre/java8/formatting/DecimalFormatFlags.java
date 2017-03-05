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


        /**
         * Other Flags
         */
        double doubleValue = 1234546.12345;

        /**
         * Zero pattern - always put zeros before and after
         * Minus sign always put zeros
         */
        String minusSign = "-000,000,000.000000";
        System.out.println(new DecimalFormat(minusSign).format(123.234));

        /**
         * You can use percentage sign as a prefix or as a suffix
         * It does multiply the value by 100 times as well
         */
        String percentage_prefix_or_suffix = "%0000.000000";
        double percentageDoubleValue = 0.025;
        System.out.println(new DecimalFormat(percentage_prefix_or_suffix).format(percentageDoubleValue));

        /**
         * \u2030 multiply it by 1000
         */
        String perMileAndMultiBy1000 = "\u2030###.###";
        System.out.println(new DecimalFormat(perMileAndMultiBy1000).format(0.00012));

        //Currency
        String currencyFormat = "¤ ###,###.###";
        System.out.println(new DecimalFormat(currencyFormat).format(23412.12121));

    }
}
