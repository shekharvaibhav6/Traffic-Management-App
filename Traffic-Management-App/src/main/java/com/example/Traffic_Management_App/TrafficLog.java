package com.example.Traffic_Management_App;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class TrafficLog {

    @Id
    private String intersectionId;
    private int vehicleCount;
    private LocalDateTime timestamp;
    TrafficLog(){

    }

    public TrafficLog(String intersectionId, int vehicleCount, LocalDateTime timestamp) {
        this.intersectionId = intersectionId;
        this.vehicleCount = vehicleCount;
        this.timestamp = timestamp;
    }

    public String getIntersectionId() {
        return intersectionId;
    }

    public void setIntersectionId(String intersectionId) {
        this.intersectionId = intersectionId;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    // Getters and setters omitted for brevity
}

