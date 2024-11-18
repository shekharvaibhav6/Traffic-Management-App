package com.example.Traffic_Management_App.docker;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrafficDataProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public TrafficDataProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendTrafficData(String intersectionId, int vehicleCount) {
        String message = "Intersection " + intersectionId + " has " + vehicleCount + " vehicles.";
        kafkaTemplate.send("traffic-data-topic", intersectionId, message);
    }
}


