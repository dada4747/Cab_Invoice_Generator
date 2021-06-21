package com.bridgelabz;

public class CabInvoiceService {
    public static final double MAXMUM_FLARE = 5;
    public static final double PER_KILOMETER_COST = 10;
    public static final int PER_MINUTE_COST = 1;

    public double calculatorFare( double distance, int time) {
        double totalFare = distance * PER_KILOMETER_COST + time * PER_MINUTE_COST;
        return Math.max(MAXMUM_FLARE, totalFare);
    }
    public double calculateFareForMultipleRides(Ride[] rides) {
        double aggregateFare = 0;
        for (Ride ride : rides) {
            aggregateFare += calculatorFare(ride.distance, ride.time);
        }
        return aggregateFare;
    }

}
