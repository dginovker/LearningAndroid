package com.example.cyn.weatherapp.Common;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Date;

public class Common {
    public static String API_KEY = "f7fd8e8ab5ab5a209bbd34822614eafe";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

    public static String apiRequest(String lat, String lon) {
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric", lat, lon, API_KEY));
        return sb.toString();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static String unixTimeStampToDateTime(double unix) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date((long) unix * 1000);
        return dateFormat.format(date);
    }

    public static String getImage(String icon) {
        return String.format("http://openweathermap.org/img/w/%s.ong", icon);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static String getDateNow()
    {
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
