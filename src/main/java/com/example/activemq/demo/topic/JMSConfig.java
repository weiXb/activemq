package com.example.activemq.demo.topic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;

import javax.jms.ConnectionFactory;
import javax.jms.JMSConnectionFactory;

/**
 * User: weixb
 * Date: 2018/7/5
 * Time: 16:05
 * Description:
 */
@Configuration
public class JMSConfig {

    @Bean
    public JmsListenerContainerFactory<?> myListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleJmsListenerContainerFactory containerFactory = new SimpleJmsListenerContainerFactory();
        containerFactory.setConnectionFactory(connectionFactory);
        containerFactory.setPubSubDomain(Boolean.TRUE);
        return containerFactory;
    }
}