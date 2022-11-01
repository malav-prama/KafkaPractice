package com.example.practice.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;

import java.util.concurrent.CountDownLatch;


@Service
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    private CountDownLatch latch = new CountDownLatch(1);

    private String payload;


//    @KafkaListener(topics = "practiceTopic", groupId = "myGroup")
//    public void consume(String message){
//        LOGGER.info(String.format("Message received -> %s", message));
//    }

    @KafkaListener(topics = "practiceTopic", groupId = "myGroup")
    public void receive(ConsumerRecord<?, ?> consumerRecord) {
        LOGGER.info("received payload='{}'", consumerRecord.toString());

        payload = consumerRecord.toString();
        latch.countDown();
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public CountDownLatch getLatch() {
        return latch;
    }

    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }

    public void resetLatch() {
        latch = new CountDownLatch(1);
    }
}