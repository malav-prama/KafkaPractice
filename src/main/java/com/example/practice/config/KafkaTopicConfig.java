package com.example.practice.config;

import org.springframework.context.annotation.Configuration;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic practiceTopic() {
        return TopicBuilder.name("practiceTopic")
                .build();
    }

    @Bean
    public NewTopic practiceJsonTopic()
    {
        return TopicBuilder.name("topicJsonName")
                .build();
    }
}