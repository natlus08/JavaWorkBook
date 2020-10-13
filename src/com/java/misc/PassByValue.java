package com.java.misc;

public class PassByValue {
	  
    public static void main(String[] args) {
        Foo a = new Foo(1);
        Foo b = new Foo(1);
 
        modify(a, b);
         
        System.out.println(a.num);
        System.out.println(b.num);
    }
  
    static void modify(Foo a1, Foo b1) {
        a1.num++;
        
        b1 = new Foo(1);
        b1.num++;
    }
}
  
class Foo {
    public int num;
    
    public Foo(int num) {
        this.num = num;
    }
}
