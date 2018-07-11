package com.example.activemq.demo.topic;

import com.example.activemq.demo.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

/**
 * User: weixb
 * Date: 2018/7/5
 * Time: 15:57
 * Description:
 */
@Service
public class Publisher {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void publish(Destination destination, Message message) {
        jmsMessagingTemplate.convertAndSend(destination, message);
    }
}