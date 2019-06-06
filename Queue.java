/**
 * Implementazione di coda con LinkedList
 */

 import java.util.*;

public class Queue {
    private LinkedList list = new LinkedList<>();
    public void put(Object V){
        list.addFirst(V);
    }
    public Object get(){
        return list.removeLast();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public static void main(String[] args){
        Queue que = new Queue();
        for(int i =0; i < 10;i++){
            que.put(Integer.toString(i));
        }
        while(!que.isEmpty())
            System.out.println(que.get());
    }
}