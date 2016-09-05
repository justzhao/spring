package com.zhaopeng.main;


import java.util.ArrayList;
import java.util.List;

/**
 * 这个类主要是用于测试 java 容器 是否为引用传参数，在作为方法参数的时候，是否会传递一个拷贝副本
 * TODO
 *
 * @author zp<zp6282154@163.com>
 * @since 2016年8月12日
 */
public class CollectionTest {

    
    public static void main(String[] args) {
        CollectionTest test=new CollectionTest();
        
        
        // case1 不会改变List内容 字符串不会变，
        //test.changeCase1();
        // case2 可以改变list的内容
        //test.changeCase1();
        
        //case 3 对象就直接改变了，
        test.changeCase3();

        
    }
    
    public void printList(List<String> list){
        
        for(String s:list){
            
            
            
            System.out.println(s);
        }
        
    }
   public void printUserList(List<User> list){
        
        for(User u:list){
            System.out.println(u.toString());
        }
        
    }
    public void changeCollection(List<String> list){
        
        /*for(String s: list){
            
            s=s+"hello";
        }*/
        
        for(int i=0;i<list.size();i++){
            
            String s=list.get(i)+"hello world";
            list.set(i, s);
        }
        
    }
    
    
    public void changeCase1(){
        
        List<String> strLis=new ArrayList<>();
        
        strLis.add("123");
        strLis.add("456");
        strLis.add("789");
     
        printList(strLis);
        System.out.println("change ??????????");
       // test.changeCollection(strLis);
        for(String s: strLis){
            
            s=s+"hello";
        }
        
       printList(strLis);
        
    }
    
    public void changeCase2(){
        
        List<String> strLis=new ArrayList<>();
        
        strLis.add("123");
        strLis.add("456");
        strLis.add("789");
     
        printList(strLis);
        System.out.println("change ??????????");
       // test.changeCollection(strLis);
        for(int i= 0;i<strLis.size();i++){
            
            strLis.set(i, strLis.get(i)+"hello world!");
            
           
        }
        
       printList(strLis);
        
    }
    
    public void changeCase3(){
        
        List<User> userLis=new ArrayList<>();
        
        userLis.add(new User(1,"jone"));
        
        userLis.add(new User(2,"tom"));
        
        userLis.add(new User(3,"tom"));
        
        printUserList(userLis);
        System.out.println("change ??????????");
       
        for(User u:userLis){
            u.setName(u.getName()+"hello wordld");
        }
      
        
        printUserList(userLis);
        
    }
    class User{
        int id;
        String name;
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        
        public User() {
        }
        public User(int id, String name) {
            super();
            this.id = id;
            this.name = name;
        }
        @Override
        public String toString() {
            return "User [id=" + id + ", name=" + name + "]";
        }
        
        
        
        
    }
    
    
}
