package com.example.cyn.weatherapp.Model;

public class MainInfo {
    private double temp;
    private double temp_max;
    private double temp_min;
    private double preasure;
    private int humidity;

    public MainInfo(double temp, double temp_max, double temp_min, double preasure, int humidity) {
        this.temp = temp;
        this.temp_max = temp_max;
        this.temp_min = temp_min;
        this.preasure = preasure;
        this.humidity = humidity;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getPreasure() {
        return preasure;
    }

    public void setPreasure(double preasure) {
        this.preasure = preasure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
