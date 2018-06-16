package com.test.Java1_8.example;

import java.util.HashMap;

class FuncInterface
{
  public static void main(String args[])
  {
 
    // lambda expression to create the object
    new Thread(()->
       {System.out.println("New thread created");}).start();
    
    Person p = new Person("XYZ");
    
    
    
 //    HashMap<Person, String> map = new HashMap<>();
//    
//    map.put(p, "Pune");
//    
    System.out.println();
    
//    System.out.println(map.get(new Person("XYZ")));
    
  }
}
