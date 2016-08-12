package com.zhaopeng.main;



public class Client {
    static ThreadLocal<Integer> intLocal = new ThreadLocal<Integer>() {  
        public Integer initialValue() {  
            return 0;  
        }  
    };  
    
    public static void main(String[] args) {
        System.out.println("123");
       
        
        TestClient t1=new TestClient(intLocal);
        TestClient t2=new TestClient(intLocal);
        TestClient t3=new TestClient(intLocal);
        
        System.out.println("hellow "+intLocal.get());
        System.out.println("456");
        t1.start();
        t2.start();
        t3.start();
        
     
    }
    
 
}
class TestClient extends Thread {  
    private ThreadLocal<Integer> intLocal ;  
    
    public TestClient() {  
       
    } 
  
    public TestClient(ThreadLocal<Integer> intLocal) {  
        System.out.println("thread[" + Thread.currentThread().getName()  
                + "]  set");
        this.intLocal = intLocal;  
        System.out.println(this.intLocal.get());
       // this.intLocal.set(0);
    }  
  
    public void run() {  
        for (int i = 0; i < 30; i++) {  
             
         /*   if(intLocal.get()==null){
                
            }else{
                int temp=intLocal.get()+1;
                intLocal.set(temp); 
            }*/
            int temp=intLocal.get()+1;
            intLocal.set(temp); 
            
            System.out.println("thread[" + Thread.currentThread().getName()  
                    + "] sn[" + intLocal.get() + "]");  
        }  
    }  
} 