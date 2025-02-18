package com.springboot.pocs.spring_kafka_demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "example-topic", groupId = "group_id")
    public void consumeMessage(String message) {
        System.out.println("Consumed message: " + message);
    }
}