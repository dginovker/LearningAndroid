package com.example.cyn.weatherapp.Model;

public class Wind {
    private int speed;
    private int degrees;

    public Wind(int speed, int degrees) {
        this.speed = speed;
        this.degrees = degrees;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }
}
