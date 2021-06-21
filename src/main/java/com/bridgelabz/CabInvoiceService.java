package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CabInvoiceService {
    public static final double MAXMUM_FLARE = 5;
    public static final double PER_KILOMETER_COST = 10;
    public static final int PER_MINUTE_COST = 1;
    RideRepository rideRepository = new RideRepository();
    ArrayList<Ride> listOfRides = new ArrayList<Ride>();

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
    public InvoiceSummary calculateSummaryFare(List<Ride> rides) {
        double fare = 0;
        for (Ride ride : rides) {
            fare += this.calculatorFare(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.size(), fare);
    }

    public void addRides(String userId, Ride[] rides) {
        rideRepository.addRide(userId, Arrays.asList(rides));
    }

    public InvoiceSummary getInvoiceSummary(String userId) {
        return this.calculateSummaryFare(rideRepository.getRides(userId));
    }

    @Override
    public String toString() {
        return "CabInvoiceService{" +
                "rideRepository=" + rideRepository +
                ", listOfRides=" + listOfRides +
                '}';
    }
}
