package com.zhaopeng.rmi;

/**
 * Created by zhaopeng on 2016/9/5.
 */
public class Consumer {
    public  static  void  main(String args[]){

        try {
            AppService appService=RMIFramework.refer(AppService.class,"127.0.0.1",1235);
            System.out.println(appService.sayHello(" zhaopeng")+"123");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
