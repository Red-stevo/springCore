package com.example.redstevo.springinversionofcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringInversionOfControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringInversionOfControlApplication.class, args);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ObjectsConfig.xml");

       DisplayService displayService = applicationContext.getBean("displayService", DisplayService.class);

        displayService.ConfigFilePrinter();

        UserModel userModel = applicationContext.getBean("userModel", UserModel.class);

    }
}
