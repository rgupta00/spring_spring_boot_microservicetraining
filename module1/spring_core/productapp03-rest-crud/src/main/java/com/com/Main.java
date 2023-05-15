package com.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
      //no new op
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        AccountService accountService=ctx.getBean("accountService",AccountService.class);
        accountService.transferFund(1,2,1000);
    }

}
