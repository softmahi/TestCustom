package com.mahesh.customImpl;

class MyRunnable implements Runnable {
    
    boolean continueThread=true;
    
    public void run() {
           int i = 0;
           
           while (true)
 
                  if (continueThread) {
                        try {
                               System.out.println(i++);
                               Thread.sleep(1000);
                               System.out.println("Please press enter key to stop "
                                         +Thread.currentThread().getName());
                        } catch (InterruptedException e) {
                               e.printStackTrace();
                        }
                  } else{
                        System.out.println(Thread.currentThread().getName()+" ENDED");
                        break;
                  }
    }
 
}
 
/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
public class TerminatingThread {
    public static void main(String args[]) throws Exception {
 
           MyRunnable obj = new MyRunnable();
           Thread t = new Thread(obj,"Thread-1");
           t.start();
 
           System.out.println(Thread.currentThread().getName()
                    +" thread waiting for user to press enter");
           System.in.read();
           obj.continueThread = false;
 
           System.out.println(Thread.currentThread().getName()+" thread ENDED");
 
    }
}
/*OUTPUT
 
main thread waiting for user to press enter
0
Please press enter key to stop Thread-1
1
Please press enter key to stop Thread-1
2
Please press enter key to stop Thread-1
3
Please press enter key to stop Thread-1
4
 
main thread ENDED
Please press enter key to stop Thread-1
Thread-1 ENDED
 
*/