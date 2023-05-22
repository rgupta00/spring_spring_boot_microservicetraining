package com.productapp.controller;

import com.productapp.config.RabbitMqConfiguration;
import com.productapp.dto.Order;
import com.productapp.dto.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(path = "orders")
public class OrderPublisherController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/{restaurantName}")
    public String bookOrder(@RequestBody Order order, @PathVariable(name = "restaurantName") String restaurantName){
        order.setId(UUID.randomUUID().toString());

        OrderStatus orderStatus=OrderStatus.builder()
                .order(order).orderStatus("PENDING")
                .message("order is booked")
                .build();

        rabbitTemplate.convertAndSend(RabbitMqConfiguration.PRODUCTAPP_EXCHANGE,
                RabbitMqConfiguration.PRODUCTAPP_ROUTINGKEY, orderStatus);

        return "order is booked";
    }

}


