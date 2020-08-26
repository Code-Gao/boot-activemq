package com.codegao.boot.activemq.topic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author huanyu
 * @date 2020/8/25 14:34
 */
@SpringBootApplication
@EnableScheduling
public class MainApp_TopicProduce {
    public static void main(String[] args) {
        SpringApplication.run(MainApp_TopicProduce.class,args);
    }
}
