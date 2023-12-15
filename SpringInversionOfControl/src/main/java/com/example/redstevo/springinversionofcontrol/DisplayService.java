
package com.example.redstevo.springinversionofcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


public class DisplayService {


    @Autowired
    UserModel userModel;
    public void ConfigFilePrinter()
    {
        ArrayList arrayList = new ArrayList();

        arrayList.add(userModel.getFirstName());
        arrayList.add(userModel.getSecondName());
        arrayList.add(userModel.getRegno());

      for(int i = 0; i < 3;i++)
      {
          System.out.print(arrayList.get(i)+"\t");
      }
    }


}

