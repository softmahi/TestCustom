/**
 * 
 */
package com.mahesh.customImpl;

/**
 * @author User1
 *
 */
public class CustomHashMap<K,V> {

	/**
	 * @param args
	 */
	
	/**
	 * We will maintain bucket (ArrayList) which will store Entry (LinkedList).
	 * 
	 * http://www.javamadesoeasy.com/2015/02/hashmap-custom-implementation.html
	 * 
	 * 
	 * @param args
	 */
	
	 private Entry<K,V>[] table;   //Array of Entry.
     

	private int capacity= 4;  //Initial capacity of HashMap
	
	public CustomHashMap() {
		 table = new Entry[capacity];
	}

	
	public static void main(String[] args) {
		
	       CustomHashMap<Integer, Integer> hashMapCustom = new CustomHashMap<Integer, Integer>();
           hashMapCustom.put(21, 12);
           hashMapCustom.put(25, 121);
           hashMapCustom.put(30, 151);
           hashMapCustom.put(33, 15);
           hashMapCustom.put(35, 89);
 
           System.out.println("value corresponding to key 21="
                        + hashMapCustom.get(21));
	}

	 public V get(K key){
	        int hash = hash(key);
	        if(table[hash] == null){
	         return null;
	        }else{
	         Entry<K,V> temp = table[hash];
	         while(temp!= null){
	             if(temp.key.equals(key))
	                 return temp.value;
	             temp = temp.next; //return value corresponding to key.
	         }         
	         return null;   //returns null if key is not found.
	        }
	    }

	public void put(K newKey,V data) {

		if (newKey == null) {
			return;
		}
		
		   //calculate hash of key.
	       int hash=hash(newKey);
	       //create new entry.
	       Entry<K,V> newEntry = new Entry<K,V>(newKey, data, null);
	       
	       
	       if(table[hash] == null){
	           table[hash] = newEntry;
	          }else{
	             Entry<K,V> previous = null;
	             Entry<K,V> current = table[hash];
	             
	             while(current != null){ //we have reached last entry of bucket.
	             if(current.key.equals(newKey)){           
	                 if(previous==null){  //node has to be insert on first of bucket.
	                       newEntry.next=current.next;
	                       table[hash]=newEntry;
	                       return;
	                 }
	                 else{
	                     newEntry.next=current.next;
	                     previous.next=newEntry;
	                     return;
	                 }
	             }
	             previous=current;
	               current = current.next;
	           }
	           previous.next = newEntry;
	          }
	      }
		
	
	

private int hash(K newKey) {
		// TODO Auto-generated method stub
	System.out.println(Math.abs(newKey.hashCode()));
	System.out.println("HASH::"+Math.abs(newKey.hashCode()) % capacity);
	return Math.abs(newKey.hashCode()) % capacity;
	}


static class Entry<K,V>{
	
	K key;
	V value;
	Entry<K,V> next;
	
	public Entry(K key, V value, Entry<K, V> next) {
		super();
		this.key = key;
		this.value = value;
		this.next = next;
	}
	
	
}


}

