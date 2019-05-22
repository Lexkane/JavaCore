package javacore10.Threads;
public class MyThread extends Thread {
    public void run( ) {
       // a long operation, calculation
       long sum = 0;
       for (int i = 0; i < 1000; i++) {
          sum += i;
       }
       System.out.println(sum);
    }
 }
