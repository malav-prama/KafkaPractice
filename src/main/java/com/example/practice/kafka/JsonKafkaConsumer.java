package com.example.practice.kafka;

import com.example.practice.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics="practiceTopicJSON", groupId = "")
    public void consume(User user)
    {
        LOGGER.info(String.format("JSON message received -> %s", user.toString()));
    }

}
