/**
 * Esempio di Thread.
 */

 public class SimpleThread extends Thread {
     private int countDown = 5;
     private static int threadCount = 0;
     private int threadNumber  = ++threadCount; 
     public SimpleThread(){
         System.out.println("Making "+threadNumber);
     }
     public void run(){
         while(true){
             System.out.println("Thread "+threadNumber+" countDown =>"+countDown);
             if(--countDown == 0) return;
         }
     }

     public static void main(String[] args){
         for(int i=0;  i< 5; i++){
             new SimpleThread().start();
         }
         System.out.println("All threads Started");
     }
 }