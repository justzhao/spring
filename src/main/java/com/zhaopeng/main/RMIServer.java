package com.zhaopeng.main;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.zhaopeng.service.IUserService;
import com.zhaopeng.service.Impl.UserServiceImpl;

/**
 * 
 * TODO
 * 远程调用例子-服务器
 * 
 * @since 2016年8月16日
 */
public class RMIServer {

    
    public static void main(String[] args) {
        try {
        IUserService userService=new UserServiceImpl();
        
    
        Registry registry = LocateRegistry.createRegistry(8888);
        registry.bind("userServer", userService);
        System.out.println("Remote userServer is bound sucessfully！");
        } catch (RemoteException e) {
            e.printStackTrace();
           
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
            
        }
    }
}
