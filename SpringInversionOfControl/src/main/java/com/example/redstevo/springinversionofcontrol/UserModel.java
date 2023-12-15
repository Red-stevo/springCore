package com.example.redstevo.springinversionofcontrol;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class UserModel {

    @Value("${UserModel.firstName}")
    private String firstName;

    @Value("${UserModel.secondName}")
    private String secondName;

    @Value("${UserModel.regNo}")
    private String regno;

    public UserModel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getRegno() {
        return regno;
    }
}
