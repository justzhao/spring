package com.zhaopeng.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
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
public class MessagePrinter implements ResourceLoaderAware {
    
    
  
    private MessageService service;
    
    private Resource resource;
    
    

    public MessagePrinter() {
        super();
    }

    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }

    public MessageService getService() {
        return service;
    }

    public void setService(MessageService service) {
        this.service = service;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        // TODO Auto-generated method stub
        
      System.out.println(resourceLoader.toString());
        
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
  
    
   
}
