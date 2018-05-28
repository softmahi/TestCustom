package com.mahesh.customImpl;


import java.util.Arrays;

/** * This class provides custom implementation of Vector(without using java api's)
 * Insertion order of objects is maintained.
 * Implementation allows you to store null as well.
 * @param <E>
 */
class VectorCustom<E> {
    
  private static final int INITIAL_CAPACITY = 10;
  private Object elementData[]={};
  private int size = 0;
 
  /**
  * constructor.
  */
  public VectorCustom() {
    elementData = new Object[INITIAL_CAPACITY];
  }
 
  /**
   * method adds elements in VectorCustom.
   */
  public synchronized void add(E e) {
    if (size == elementData.length) {
      ensureCapacity(); //increase current capacity of list, make it double.
    } 
    elementData[size++] = e;
  }
 
 
  /**
   * method returns element on specific index.
   */
  @SuppressWarnings("unchecked")
  public synchronized E get(int index) {
    //if index is negative or greater than size of size, we throw Exception.
    if ( index <0 || index>= size) {  
      throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
    }
    return (E) elementData[index]; //return value on index.
  }
 
 
  /**
   * method returns removedElement on specific index.
   * else it throws IndexOutOfBoundException if index is negative or greater than size of size.
   */
  public synchronized Object remove(int index) {
    if ( index <0 || index>= size) {  //if index is negative or greater than size of size, we throw Exception.
      throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
    }
   
    Object removedElement=elementData[index];
    for(int i=index;i<size - 1;i++){
       elementData[i]=elementData[i+1];
    }
    size--;   //reduce size of VectorCustom after removal of element.
   
    return removedElement;
  }
 
 
  /**
   * method increases capacity of list by making it double.
   */
  private void ensureCapacity() {
    int newIncreasedCapacity = elementData.length * 2;
    elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
  }
 
  /**
   * method displays all the elements in list.
   */
  public void display() {
      System.out.print("Displaying list : ");
      for(int i=0;i<size;i++){
             System.out.print(elementData[i]+" ");
      }
  }
 
}
 
/** Copyright (c), AnkitMittal  JavaMadeSoEasy.com */
/**
 * Main class to test VectorCustom functionality.
 */
public class VectorCustomImpl {
     
      public static void main(String...a) {
           VectorCustom<Integer> list = new VectorCustom<Integer>();
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(1);
     list.add(2);
     
     list.display();
     System.out.println("\nelement at index "+1+" = "+list.get(1));
     System.out.println("element removed from index "+1+" = "+list.remove(1));
     
     System.out.println("\nlet's display list again after removal at index 1");
     
     list.display();
     
     //list.remove(11);  //will throw IndexOutOfBoundsException, because there is no element to remove on index 11.
     //list.get(11);   //will throw IndexOutOfBoundsException, because there is no element to get on index 11.
     
      }
     
}
/*Output
 
Displaying list : 1 2 3 4 1 2
element at index 1 = 2
element removed from index 1 = 2
 
let's display list again after removal at index 1
Displaying list : 1 3 4 1 2
 
*/
