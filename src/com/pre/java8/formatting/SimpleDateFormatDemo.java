package com.pre.java8.formatting;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by udoluweera on 3/1/17.
 */
public class SimpleDateFormatDemo {

    public static void main(String[] args) {

        /**
         * M - Month
         *
         * M - Single digit month - 1
         * MM - Add zero - 01
         * MMM -Jan
         * MMMM - January
         *
         * d - day
         * dd - add zero
         *
         * y - year
         * yy - 05
         * yyyy - 2005
         *
         * h - hour
         * hh - two digits
         *
         * mm - minutes
         * ss - seconds
         *
         * E - day name - Tue
         * EEEE - Full day name  - Tuesday
         */

        //Additional d for date wil add additional zero in front - 002 Mar 2017
        SimpleDateFormat simpleDateFormatDate = new SimpleDateFormat("ddd M yyyy");
        System.out.println(simpleDateFormatDate.format(new Date()));

        SimpleDateFormat dayOFTheWeek = new SimpleDateFormat("EEEE dd MMMM yyyy KK:mm:ss a");
        System.out.println(dayOFTheWeek.format(new Date()));






    }
}
