package com.bridgelabz;

public class Ride {
    public double distance;
    public int time;

    public Ride(double distance, int time) {

        this.distance = distance;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "distance=" + distance +
                ", time=" + time +
                '}';
    }
}

