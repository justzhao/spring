package com.zhaopeng.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IUserService   extends Remote{
    
    String sayHello() throws RemoteException;

}
