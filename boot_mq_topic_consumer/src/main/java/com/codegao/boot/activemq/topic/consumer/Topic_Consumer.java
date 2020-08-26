package com.codegao.boot.activemq.topic.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @author huanyu
 * @date 2020/8/25 14:37
 */

@Component
public class Topic_Consumer {

    @JmsListener(destination = "${mytopic}")
    public void reveive(TextMessage text)throws JMSException {
        System.out.println("消费者收到订阅的主题："+text.getText());
    }

}
