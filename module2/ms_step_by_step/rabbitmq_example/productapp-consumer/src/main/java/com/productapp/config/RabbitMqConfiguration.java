package com.productapp.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfiguration {
    public static final String PRODUCTAPP_QUEUE = "productapp_queue";
    public static final String PRODUCTAPP_EXCHANGE = "productapp_exchange";
    public static final String PRODUCTAPP_ROUTINGKEY = "productapp_routingkey";
    //Create the queue
    @Bean
    public Queue queue(){
        return new Queue(PRODUCTAPP_QUEUE);
    }
    //create topic
    @Bean
    public TopicExchange exchange(){
        return new TopicExchange(PRODUCTAPP_EXCHANGE);
    }
    //bind queue with topic
    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(PRODUCTAPP_ROUTINGKEY);
    }
    //configure messageConvertor: json
    @Bean
    public MessageConverter converter(){
        return new Jackson2JsonMessageConverter();
    }
    //AMQP / RabbitMQ configuration
    @Bean
    public RabbitTemplate template(ConnectionFactory connectionFactory){
        RabbitTemplate rabbitTemplate=new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(converter());
        return rabbitTemplate;
    }

}
