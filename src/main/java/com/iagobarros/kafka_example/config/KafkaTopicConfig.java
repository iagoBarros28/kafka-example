package com.iagobarros.kafka_example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaTopicConfig {

    @Bean
    public NewTopic iagobarrosTopic(){
        return TopicBuilder.name("iagobarros").build();
    }

}
