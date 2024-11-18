package com.example.Traffic_Management_App;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TrafficDataConsumer {

    @KafkaListener(topics = "traffic-data-topic", groupId = "traffic-consumers")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
        // Process the message (e.g., store data in the database or update the cache)
    }
}
