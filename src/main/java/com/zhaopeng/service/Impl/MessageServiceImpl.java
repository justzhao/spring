package com.zhaopeng.service.Impl;

import com.zhaopeng.service.MessageService;

public class MessageServiceImpl implements MessageService {
    private int index=0;

    public String getMessage() {
        // TODO Auto-generated method stub
        System.out.println(index++);
        return "Hello World!!";
    }

}
