package com.zhaopeng.main;

public class SynchronizedTest {
    
    
    public synchronized void sendMessage(){
        
        System.out.println("hello!");
    }
    
    public synchronized  static void sendRadio(){
        
        System.out.println("hello!");
    }
    
    
    public void sendImage(){
        synchronized (SynchronizedTest.class) {
            
        }
    }
    
    public void sendVideo(){
        synchronized (this) {
            
        }
    }
    

}
