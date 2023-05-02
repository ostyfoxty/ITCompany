package com.example.javalaba63;

import java.util.Locale;
import java.util.ResourceBundle;

public class AppLocale {
    private static final String strMsg = "Msg";
    private static Locale loc = Locale.getDefault();
    static ResourceBundle res = ResourceBundle.getBundle( AppLocale.strMsg, AppLocale.loc );


    static void set( Locale loc ) {
        AppLocale.loc = loc;
        res = ResourceBundle.getBundle( AppLocale.strMsg, AppLocale.loc );
    }

    static String getString( String key ) {
        return AppLocale.res.getString(key);
    }

    public static final String worker = "worker";
    public static final String type = "type";

}
