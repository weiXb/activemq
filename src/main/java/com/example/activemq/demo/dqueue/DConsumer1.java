package com.example.activemq.demo.dqueue;

import org.apache.activemq.command.ActiveMQObjectMessage;
import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;

/**
 * User: weixb
 * Date: 2018/7/5
 * Time: 10:15
 * Description:
 */
@Component
public class DConsumer1 {

    @JmsListener(destination = "test.back.queue")
    @SendTo("back.queue")
    public String receiveQueue(Object message) {
        ObjectMessage objectMessage = (ObjectMessage) message;

        try {
            System.out.println("Consumer1收到的消息：" + objectMessage.getObject());
        } catch (JMSException e) {
            e.printStackTrace();
        }
        return "Consumer1回复消息";
    }
}