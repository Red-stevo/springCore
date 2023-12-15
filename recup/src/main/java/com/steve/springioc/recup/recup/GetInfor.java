package com.steve.springioc.recup.recup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class GetInfor {


    @Autowired
    LoginService loginService;

    public GetInfor(LoginService loginService)
    {
        this.loginService = loginService;
    }

    public void setLoginService(LoginService loginService)
    {
        this.loginService = loginService;
        System.out.println("Was Used.");
    }

    public void printer()
    {
        ArrayList arrayList = new ArrayList();

        arrayList.add(loginService.getName());
        arrayList.add(loginService.getPassword());

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
    }
}
