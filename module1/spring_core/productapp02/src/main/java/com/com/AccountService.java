package com.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//AccountService---> EmailService
//AccountService<----MessageService
//whenver i need to use diff type of messaging service i need to change my code :(
@Service(value = "accountService")
public class AccountService {

    @Autowired
    private MessageService messageService;

    public void transferFund(int fromAcc, int toAcc, double amout){

        System.out.println(messageService.sendMessage());
        System.out.println("fund is transfred");
        ///
    }
}
