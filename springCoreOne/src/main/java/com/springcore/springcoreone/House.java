package com.springcore.springcoreone;

import org.springframework.stereotype.Component;


public class House {
    private HouseWindows houseWindows;
    private HouseDoor houseDoor;

    public House()
    {
        System.out.println("House Constructed.....");
        System.out.println(houseWindows);
        System.out.println(houseDoor);
    }

    public void setHouseWindows(HouseWindows houseWindows) {
        this.houseWindows = houseWindows;
    }

    public void setHouseDoor(HouseDoor houseDoor) {
        this.houseDoor = houseDoor;
    }
}
