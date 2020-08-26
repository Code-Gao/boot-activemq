package com.codegao.boot.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @author huanyu
 * @date 2020/8/25 10:31
 */

@Component
public class Queue_Consumer {

    @JmsListener(destination = "${myqueue}")
    public void receive(TextMessage textMessage)throws JMSException {
        System.out.println("******消费者接收到消息："+textMessage.getText());
    }

}
