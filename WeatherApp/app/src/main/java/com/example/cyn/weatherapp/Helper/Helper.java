package com.example.cyn.weatherapp.Helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Helper {
    static String stream = null;

    public Helper() {

    }

    public String getHTTPData (String urlString)
    {
        try {
            URL url = new URL(urlString);
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            if (httpURLConnection.getResponseCode() == 200)
            {
                BufferedReader r = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = r.readLine()) != null)
                {
                    sb.append(line);
                }

                stream = sb.toString();
                httpURLConnection.disconnect();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        return stream;
    }
}
