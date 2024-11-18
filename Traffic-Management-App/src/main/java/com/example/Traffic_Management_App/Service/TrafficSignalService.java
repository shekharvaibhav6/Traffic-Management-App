package com.example.Traffic_Management_App.Service;

import org.springframework.stereotype.Service;

@Service
public class TrafficSignalService {

    // Example method to adjust traffic light based on vehicle count
    public String adjustTrafficSignal(String intersectionId, int vehicleCount) {
        if (vehicleCount > 50) {
            return "Green light for Intersection " + intersectionId + " for 30 seconds.";
        } else {
            return "Red light for Intersection " + intersectionId + " for 30 seconds.";
        }
    }
}
