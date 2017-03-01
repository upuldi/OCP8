package com.pre.java8.language_fund;

/**
 * Created by udoluweera on 3/1/17.
 */
public class SwitchCase {

    public static void main(String[] args) {

        /**
         * Supporting types
         *
         * byte - 8
         * short - 16
         * char - 16
         * int - 32
         *
         * Byte
         * Short
         * Character
         * Integer
         *
         * String
         * enum
         *
         */

        //valid definitions

        //With a constant in the switch
        switch(15) {}

        //Wo body
        int x = 10;
        switch (x) {}

        //No content for the case statements and no default statement
        int y = 10;
        switch (y) {
            case 10:
            case 11:
            case 12:
        }

        //Only with default
        switch(x) {
            default:
        }

        //With Different integer values for switch and case
        final byte byteVal = 10;
        final int intSwitchVal = 100;

        switch (intSwitchVal) {
            case byteVal:
        }

        switch(byteVal) {
            case intSwitchVal:
        }

        //multi lines in case with out {}
        switch(100) {
            case 125:
                System.out.println("One line");
                System.out.println("another line");
                break;
            default:
                System.out.println("default line");
                System.out.println("another default line");
        }


        //Default can be in anywhere
        switch(1500) {
            default:
                System.out.println("Default first");
                break;
            case 1000:
                System.out.println("Then the case");
                break;
        }




        //Invalid Definitions

        //No Constants for the case
        int notAConstant = 100;
        switch (x) {
//             case notAConstant:
        }

        //Different types in switch and case statements
        String swtichStringVal = "ABC";
        final int invalidIntForStringSwitch = 100;
        switch(swtichStringVal) {
            //case invalidIntForStringSwitch:
        }



    }

    /**
     * The following also invalid
     * @param caseValue
     */
    private void someStupidMethod(final String caseValue) {
        switch (1500) {
            //case caseValue: //Here the case value is not a true constant
        }
    }
}
