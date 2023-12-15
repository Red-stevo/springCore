package com.springcore.springcoreone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.springcoreone")
public class HouseConfig {

    @Bean
    public HouseWindows houseWindowsBean()
    {
        return new HouseWindows();
    }

    @Bean
    public HouseDoor houseDoorBean()
    {
        return new HouseDoor();
    }

    @Bean("house")
    public House houseBean()
    {
        House house = new House();

        house.setHouseWindows(houseWindowsBean());

        house.setHouseDoor(houseDoorBean());

        return house;
    }
}
