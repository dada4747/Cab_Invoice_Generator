package com.bridgelabz;

public class InvoiceSummary {
    public int noOfRides;
    public double totalFare;
    public double averageOfRides;

    public InvoiceSummary(int noOfRides, double totalFare) {
        this.noOfRides = noOfRides;
        this.totalFare = totalFare;
        this.averageOfRides = (totalFare / noOfRides);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return noOfRides == that.noOfRides &&
                Double.compare(that.totalFare, totalFare) == 0 &&
                Double.compare(that.averageOfRides, averageOfRides) == 0;
    }
}

