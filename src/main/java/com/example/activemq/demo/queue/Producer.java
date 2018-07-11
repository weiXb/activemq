package com.example.activemq.demo.queue;

import com.example.activemq.demo.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.ObjectMessage;

/**
 * User: weixb
 * Date: 2018/7/5
 * Time: 10:09
 * Description:
 */
@Service
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendMyMessage(Destination destination, Message message) {
        jmsMessagingTemplate.convertAndSend(destination, message);
    }
}