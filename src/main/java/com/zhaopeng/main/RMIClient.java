package com.zhaopeng.main;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.zhaopeng.service.IUserService;

public class RMIClient {
    
    public static void main(String[] args) {
        
        try {
            IUserService userService =(IUserService) Naming.lookup("rmi://localhost:8888/userServer");
            for(int i=0;i<5;i++){
                System.out.println(userService.sayHello());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            
        } catch (RemoteException e) {
            e.printStackTrace();
           
        } catch (NotBoundException e) {
            e.printStackTrace();
           
        }  
    }

}
