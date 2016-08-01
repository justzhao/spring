package com.zhaopeng.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zhaopeng.service.MessageService;
/**
 *  
 *  
 *  
 * @author zhaopeng
 * @since 2016-8-1 下午6:10:18
 * @ClassName MessagePrinter.java 
 * @Description
 *
 */
@Component
public class MessagePrinter {
    final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
