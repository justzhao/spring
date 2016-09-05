package com.zhaopeng.rmi;

/**
 * Created by zhaopeng on 2016/9/5.
 */
public class Provider {

    public static  void  main(String args[]){
        AppService appService=new AppServiceImpl();
        try {
            RMIFramework.export(appService,AppService.class,1235);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
