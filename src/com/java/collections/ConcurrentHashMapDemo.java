package com.java.collections;
import java.util.HashMap;
import java.util.Map;

class ConcurrentHashMapDemo extends Thread 
{ 
    static Map<Integer,String> l=new HashMap<Integer,String>(); 
  
    public void run() 
    { 
        // Child thread trying to add 
        // new element in the object 
        l.put(103,"D"); 
        System.out.println("Added D");
        try
        { 
            Thread.sleep(1000); 
        } 
        catch(InterruptedException e) 
        { 
            System.out.println("Child Thread going to add element"); 
        } 
    } 
  
    public static void main(String[] args) throws InterruptedException 
    { 
        l.put(100,"A"); 
        l.put(101,"B"); 
        l.put(102,"C"); 
        ConcurrentHashMapDemo t = new ConcurrentHashMapDemo(); 
        t.start();     
        
        for (Object o : l.entrySet())  
        { 
            Object s=o; 
            System.out.println(s); 
            Thread.sleep(1000); 
        } 
       
        System.out.println(l); 
    } 
} 