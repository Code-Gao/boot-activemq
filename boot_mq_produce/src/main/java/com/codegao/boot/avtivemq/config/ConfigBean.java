package com.codegao.boot.avtivemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * @author huanyu
 * @date 2020/8/24 17:10
 */

@Component
@EnableJms
public class ConfigBean {

    @Value("${myqueue}")
    private String myQuene;

    @Bean
    public Queue queye(){
        return new ActiveMQQueue(myQuene);
    }



}
