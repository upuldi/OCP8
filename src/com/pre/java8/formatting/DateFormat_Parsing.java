package com.pre.java8.formatting;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * Created by udoluweera on 3/1/17.
 */
public class DateFormat_Parsing {

    public static void main(String[] args) {

        DateFormat shortDateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        String usLocaleDateString = "1/31/1984";

        //Parse Exception is a CheckedException
        try {
            Date dateFromUsLocale = shortDateFormat.parse(usLocaleDateString);
            System.out.println("Short US Date Format: " + dateFromUsLocale);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        /**
         * You have to use the same date format to parse it back to a date object
         */

        DateFormat formatFullDateTimeGr = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG,Locale.GERMANY);
        String germanFullDateTimeString = formatFullDateTimeGr.format(new Date());

        DateFormat formatFullDateTimeCha = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG,Locale.GERMANY);
        try {
            System.out.println("Chinease full date time: " + formatFullDateTimeCha.parse(germanFullDateTimeString));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
