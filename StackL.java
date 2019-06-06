/**
 * Realizzazione di una pila con la linkeList.
 * 
 */

 import java.util.*;

 public class StackL {
     private LinkedList list = new LinkedList<>();
     public void push(Object V){
        list.addFirst(V);
     }
     public Object pop(){
         return list.removeFirst();
     }
     public Object top(){
         return list.getFirst();
     }
     public static void main(String[] args){
         StackL stack = new StackL();
         for(int i=0; i < 10; i++){
            Integer val = new Integer(i);
            stack.push(val);
            System.out.println("push:"+val);
         }
         System.out.println("top:"+stack.top());
         System.out.println("pop:"+stack.pop());
         System.out.println("top:"+stack.top());

     }
 }