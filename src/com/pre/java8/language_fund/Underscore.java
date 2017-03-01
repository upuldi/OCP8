package com.pre.java8.language_fund;

/**
 * Created by udoluweera on 3/1/17.
 */
public class Underscore {

    public static void main(String[] args) {

        /**
         * Underscore issues
         */
//        long beginning = _12334;
//        int end = 12345_;
//        double beforeDecimalPoint = 12345_.123;
//        double afterDecimalPoint = 1234._123;

        /**
         * Underscore ok
         */
        double okPlaces = 123_456.789_101123;
        System.out.println("OK Double:" + okPlaces);

        int okZero = 0_0;
        System.out.println("OK Zero: " + okZero);



    }
}
