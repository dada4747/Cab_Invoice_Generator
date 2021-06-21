package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;

public class RideRepository {
    HashMap<String, ArrayList<Ride>> userRides = new HashMap<>();

    public void addUserRides(String userId, ArrayList<Ride> listOfRides) {
        userRides.put(userId, listOfRides);
    }

    public ArrayList<Ride> getRidesByUserId(String userId) {
        ArrayList<Ride> rides = userRides.get(userId);
        return rides;
    }
}