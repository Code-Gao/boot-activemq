package com.codegao.boot.activemq;

import com.codegao.boot.avtivemq.MainApp_Produce;
import com.codegao.boot.avtivemq.produce.Queue_Produce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @author huanyu
 * @date 2020/8/24 17:22
 */
@SpringBootTest(classes = MainApp_Produce.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestActiveMQ {
    @Resource
    private Queue_Produce queue_produce;

    @Test
    public void testSend() throws Exception{
        queue_produce.produceMsq();
    }

}
