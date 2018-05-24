package jdk1_8;

class FuncInterface
{
  public static void main(String args[])
  {
 
    // lambda expression to create the object
    new Thread(()->
       {System.out.println("New thread created");}).start();
  }
}
