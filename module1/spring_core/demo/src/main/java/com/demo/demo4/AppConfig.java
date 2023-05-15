package com.demo.demo4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
<context:annotation-config/>
    <context:component-scan base-package="com.demo.demo2"/>
 */
@Configuration
@ComponentScan(basePackages = {"com.demo.demo4"})
public class AppConfig {
}
