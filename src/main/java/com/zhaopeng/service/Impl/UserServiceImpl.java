package com.zhaopeng.service.Impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.zhaopeng.service.IUserService;

/**
 * 远程调用例子
 * TODO
 *
 * @author 
 * @since 2016年8月16日
 */
public class UserServiceImpl  extends UnicastRemoteObject implements IUserService {

    private int index=0;
    /** TODO */
    private static final long serialVersionUID = 1L;

    public UserServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        // TODO Auto-generated method stub
        System.out.println(index++);
        return "hello!";
    }

}
