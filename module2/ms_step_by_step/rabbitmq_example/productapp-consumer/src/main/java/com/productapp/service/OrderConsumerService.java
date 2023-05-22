package com.productapp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.productapp.config.RabbitMqConfiguration;
import com.productapp.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumerService {

    @RabbitListener(queues = RabbitMqConfiguration.PRODUCTAPP_QUEUE)
    public void processOrder(OrderStatus orderStatus)throws Exception{
        System.out.println("---------order is processed --"+ new ObjectMapper().writeValueAsString(orderStatus));
    }
}
