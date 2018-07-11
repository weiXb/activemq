package com.example.activemq.demo.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * User: weixb
 * Date: 2018/7/5
 * Time: 11:26
 * Description:
 */
@Data
@Component
public class Queue1 {

    @Value("${queueName}")
    private String queueName;
}