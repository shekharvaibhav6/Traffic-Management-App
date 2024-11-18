package com.example.Traffic_Management_App.controller;

import com.example.Traffic_Management_App.Service.TrafficSignalService;
import com.example.Traffic_Management_App.TrafficCacheService;
import com.example.Traffic_Management_App.docker.TrafficDataProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/traffic")
public class TrafficController {

    @Autowired
    private TrafficDataProducer trafficDataProducer;
    @Autowired
    private TrafficSignalService trafficSignalService;
    @Autowired
    private TrafficCacheService trafficCacheService;

    @PostMapping("/data")
    public void sendTrafficData(@RequestParam String intersectionId, @RequestParam int vehicleCount) {
        trafficDataProducer.sendTrafficData(intersectionId, vehicleCount);
    }

    @GetMapping("/signal")
    public String getTrafficSignal(@RequestParam String intersectionId, @RequestParam int vehicleCount) {
        return trafficSignalService.adjustTrafficSignal(intersectionId, vehicleCount);
    }

    @GetMapping("/cachedData")
    public String getCachedTrafficData(@RequestParam String intersectionId) {
        return trafficCacheService.getTrafficData(intersectionId);
    }
}
