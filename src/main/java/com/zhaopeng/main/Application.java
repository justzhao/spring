package com.zhaopeng.main;

import java.io.ByteArrayOutputStream;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

import com.zhaopeng.action.MessagePrinter;
import com.zhaopeng.service.MessageService;
/**
 * 
 * TODO
 *
 * @author zp
 * @since 2016年8月4日
 */
@Configuration
@ComponentScan({"com.zhaopeng" })
public class Application {
    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }

    public static void main(String[] args) {
     /*   ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();*/
       
        
   /*     System.out.println("FileSystemXmlApplicationContext");
        
        ApplicationContext context = new FileSystemXmlApplicationContext("E:\\workspace\\spring\\src\\main\\resources\\ApplicationContext.xml");
        MessagePrinter printer = (MessagePrinter) context.getBean("messagePrinter");
        printer.printMessage();

        Resource fileres = context.getResource("book.xml");
        // 获取该资源的简单信息
        System.out.println(fileres.getFilename());
        System.out.println(fileres.getDescription());*/

        
        System.out.println("123");
        
        
        System.out.println("hello");

        System.out.println("world");

        System.out.println("123123123sf");
        System.out.println("ClassPathXmlApplicationContext");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        MessagePrinter mp = (MessagePrinter) ctx.getBean("messagePrinter");

        mp.printMessage();
        
        Resource classres = ctx.getResource("book.xml");
        // 获取该资源的简单信息
        System.out.println(classres.getFilename());
        System.out.println(classres.getDescription());
        
        //使用依赖注入管理资源文件
        System.out.println("使用依赖注入管理资源文件");
        Resource iocres = mp.getResource();
        System.out.println(iocres.getFilename());
        System.out.println(iocres.getDescription());
        
        String aa="";
        aa.substring(0, 0);
        
        // Resource res = ctx.getResource("book.xml");

        // ApplicationContext appContext=new ClassPathXmlApplicationContext("");

        // 加载资源文件
        // Resource resource=new FileSystemResource("file:book.xml");

        // Spring 加载资源文件方式

        // ResourceLoader

        // ResourceLoaderAware
       

    }

}
