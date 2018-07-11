package com.example.activemq.demo.queue;

import com.example.activemq.demo.entity.Message;
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
public class Consumer2 {

    @JmsListener(destination = "mytest.queue")
    @SendTo("back.queue")
    public String receiveQueue(Message message) {

        try {
            System.out.println("Consumer2收到的消息：" + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Consumer2收到消息回复";
    }
}