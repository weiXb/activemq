package com.example.activemq.demo.topic;

import com.example.activemq.demo.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * User: weixb
 * Date: 2018/7/5
 * Time: 16:00
 * Description:
 */
@Component
public class Subscriber {

    @JmsListener(destination = "test.topic", containerFactory = "myListenerContainerFactory")
    public void subscribe(Message message) {
        System.out.println("Subscriber1收到推送消息：" + message);
    }
}