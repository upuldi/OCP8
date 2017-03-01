package com.pre.java8.formatting;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by udoluweera on 3/1/17.
 */
public class DateFormatDemo_format {

    public static void main(String[] args) {

        DateFormat dateFormatDate = DateFormat.getDateInstance();
        DateFormat dateFormatTime = DateFormat.getTimeInstance();
        DateFormat dateFormatDateAndTime = DateFormat.getDateTimeInstance();

        //Default
        System.out.println("Default date: " + dateFormatDate.format(new Date()));

        //Date Formatting
        DateFormat shortDate = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Style Short Date: " + shortDate.format(new Date()));

        DateFormat longDate = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Style Long Date: " + longDate.format(new Date()));

        DateFormat mediumDate = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Style Medium Date: " + mediumDate.format(new Date()));

        DateFormat fullDate = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Style Full Date: " + fullDate.format(new Date()));

        //Time Formatting
        System.out.println("Default Time Formattig: " + dateFormatTime.format(new Date()));

        DateFormat shortTime = DateFormat.getTimeInstance(DateFormat.SHORT);
        System.out.println("Short Time: " + shortTime.format(new Date()));

        DateFormat longTime = DateFormat.getTimeInstance(DateFormat.LONG); //You get the TimeZone
        System.out.println("Long Time: " + longTime.format(new Date()));

        DateFormat mediumTime = DateFormat.getTimeInstance(DateFormat.MEDIUM);
        System.out.println("Medium Time: " + mediumTime.format(new Date()));

        DateFormat fullTime = DateFormat.getTimeInstance(DateFormat.FULL); //Time Zone
        System.out.println("Full Time: " + fullTime.format(new Date()));

        //Date And Time Formatting
        System.out.println("Default: "+ dateFormatDateAndTime.format(new Date()));

        DateFormat dateAndTimeDifferent = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG);
        System.out.println("Custom Date and Time Styles: " + dateAndTimeDifferent.format(new Date()));

        //with locale
        DateFormat dateTimeAndLocale = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.FULL, Locale.GERMANY);
        System.out.println("With Different locale: " + dateTimeAndLocale.format(new Date()));

    }
}
