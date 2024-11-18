package com.example.Traffic_Management_App;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TrafficCacheService {

    @Cacheable("trafficData")
    public String getTrafficData(String intersectionId) {
        // Simulate a delay in fetching data from the database
        return "Current traffic data for intersection " + intersectionId + " is being processed.";
    }
}
