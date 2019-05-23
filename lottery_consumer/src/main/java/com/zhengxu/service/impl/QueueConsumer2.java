package com.zhengxu.service.impl;

import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@Service
public class QueueConsumer2 implements MessageListener {
    @Override
    public void onMessage(Message message) {
        // 将message转换成text类型,获得text
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("消费者QueueConsumer2获取消息:" + textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}