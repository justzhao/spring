package com.zhaopeng.main;

public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass() {

    }

    public synchronized static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }

        return instance;
    }

    //双重加锁
    public static SingletonClass getInstanceByDouble() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }

    //静态内部类
    private static class SingletonHolder {
        private static final SingletonClass INSTANCE = new SingletonClass();
    }

    public static SingletonClass getInstanceByStatic() {

        return SingletonHolder.INSTANCE;
    }

}
