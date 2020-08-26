package com.codegao.boot.activemq.topic.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

/**
 * @author huanyu
 * @date 2020/8/25 14:26
 */

@Component
@EnableJms
public class ConfigBean {

    @Value("${mytopic}")
    private String topicName;

    @Bean
    public Topic topic(){

        return new ActiveMQTopic(topicName);
    }

}
