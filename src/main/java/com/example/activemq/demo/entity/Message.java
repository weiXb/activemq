package com.example.activemq.demo.entity;

import lombok.Data;

import javax.jms.ObjectMessage;
import java.io.Serializable;

/**
 * User: weixb
 * Date: 2018/7/5
 * Time: 11:01
 * Description:
 */
@Data
public class Message implements Serializable {
    public Message(Integer id) {
        this.id = id;
        this.message = "这是消息" + id;
    }

    public Message() {
    }

    private Integer id;
    private String message;
}