package com.springcore.springcoreone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreOneApplication {

    public static void main(String[] args)
    {
        //SpringApplication.run(SpringCoreOneApplication.class, args);

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(HouseConfig.class);

        House house = applicationContext.getBean("house", House.class);
        applicationContext.close();
    }
}
