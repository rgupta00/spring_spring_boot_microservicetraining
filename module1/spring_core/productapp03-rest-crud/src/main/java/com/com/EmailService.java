package com.com;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailService implements MessageService{
    public String sendMessage(){
        return "email is send";
    }
}
