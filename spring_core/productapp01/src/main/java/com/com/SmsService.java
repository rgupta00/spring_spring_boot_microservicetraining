package com.com;

import org.springframework.stereotype.Service;

@Service
public class SmsService  implements MessageService{
    public String sendMessage(){
        return "sms is send";
    }
}
