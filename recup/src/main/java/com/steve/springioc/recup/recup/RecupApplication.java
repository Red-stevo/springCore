package com.steve.springioc.recup.recup;

import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class RecupApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(RecupApplication.class, args);

      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringIOC.xml");

      GetInfor getInfor = applicationContext.getBean("getInfor", GetInfor.class);

      getInfor.printer();
    }

}
