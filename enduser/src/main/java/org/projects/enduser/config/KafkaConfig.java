package org.projects.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics=AppConstants.LOCATION_CONSUMER_TOPIC_NAME, groupId = AppConstants.GROUP_ID)
    public void consumerLocation(String value){
        System.out.println(value);
    }
}
