package com.example.activemq;

import com.example.activemq.demo.queue.Producer;
import com.example.activemq.demo.entity.Message;
import com.example.activemq.demo.dqueue.DProducer;
import com.example.activemq.demo.topic.Publisher;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivemqApplicationTests {

    @Autowired
    private Producer producer;

    @Autowired
    private Publisher publisher;

    @Autowired
    private DProducer dProducer;


    @Test
    public void testQueue() throws Exception {
        Destination destination = new ActiveMQQueue("mytest.queue");

        for (int i = 0; i < 5; i++) {
            Message message = new Message(i);
            producer.sendMyMessage(destination, message);
        }
    }

    @Test
    public void testDQueue() throws Exception {
        Destination destination = new ActiveMQQueue("test.back.queue");

        for (int i = 0; i < 5; i++) {
            Message message = new Message(i);
            dProducer.sendMyMessage(destination, message);
        }
    }

    @Test
    public void testTopic() throws Exception {
        Destination destination = new ActiveMQTopic("test.topic");
        for (int i = 0; i < 5; i++) {
            Message message = new Message(i);
            publisher.publish(destination, message);
        }

    }

}
