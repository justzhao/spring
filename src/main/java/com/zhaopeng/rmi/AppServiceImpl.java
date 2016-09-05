package com.zhaopeng.rmi;

/**
 * Created by zhaopeng on 2016/9/5.
 */
public class AppServiceImpl implements  AppService {

    private static  int count=0;

    public String sayHello() {

        System.out.println("this is hello");
        return "this is froms provider";
    }

    @Override
    public String sayHello(String name) {
        System.out.println("this is hello"+name+"  "+count++);
        return " server hello"+name;
    }


}
