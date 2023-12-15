package com.steve.springioc.recup.recup;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LoginService {

    private String name;
    private String password;

    public LoginService(String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    public LoginService()
    {

    }
    @Value("Stephen Muiru")
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return this.password;
    }


}
