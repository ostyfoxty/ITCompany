package com.example.javalaba63;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DataFormatDemo {
    static public String displayDate(Locale currentLocale) {

        Date today;
        String dateOut;
        DateFormat dateFormatter;

        dateFormatter =
                DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
        today = new Date();
        dateOut = dateFormatter.format(today);

       return dateOut + "   " + currentLocale.toString();
    }

    static int[] styles = {
            DateFormat.DEFAULT,
            DateFormat.SHORT,
            DateFormat.MEDIUM,
            DateFormat.LONG,
            DateFormat.FULL
    };

    static public String showBothStyles(Locale currentLocale) {

        Date today;
        String result;
        DateFormat formatter;
        today = new Date();


            formatter = DateFormat.getDateTimeInstance(
                    styles[0], styles[0], currentLocale);
            result = formatter.format(today);
           return result;

    }

    static public String showDateStyles(Locale currentLocale) {
        Date today=new Date();
        String result;
        DateFormat formatter;


            formatter =
                    DateFormat.getDateInstance(styles[0], currentLocale);
            result = formatter.format(today);
            return result;


    }

    static public void showTimeStyles(Locale currentLocale) {

        Date today = new Date();
        String result;
        DateFormat formatter;

        System.out.println();
        System.out.println("Locale: " + currentLocale.toString());
        System.out.println();

        for (int k = 0; k < styles.length; k++) {
            formatter =
                    DateFormat.getTimeInstance(styles[k], currentLocale);
            result = formatter.format(today);
            System.out.println(result);
        }
    }

    static public void main(String[] args) {

        Locale[] locales = {
                new Locale("be","BY"),
                new Locale("ru","RU"),
                new Locale("en","GB")
        };

        for (int i = 0; i < locales.length; i++) {
            displayDate(locales[i]);
        }

        showDateStyles(new Locale("en","GB"));
        showDateStyles(new Locale("ru","RU"));
        showDateStyles(new Locale("be","BY"));

        showTimeStyles(new Locale("en","GB"));
        showTimeStyles(new Locale("ru","RU"));
        showTimeStyles(new Locale("be","BY"));

        showBothStyles(new Locale("en","GB"));
        showBothStyles(new Locale("ru","RU"));
        showBothStyles(new Locale("be","BY"));

    }
}
