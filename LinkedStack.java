/**
 * Esempio di Stack creato con la linked list ed all'interno nodi
 */

 public class LinkedStack<T>{
     //inner class
     private class Node<U>{
         U item;
         Node<U> next;
         Node(){}
         Node(U item, Node<U> next){
             this.item = item;
             this.next= next;
         }
         boolean end(){
             return item == null && next == null;
         }
     }

     private Node<T> top = new Node<T>();
     
     public void push(T item){
         top = new Node<T>(item,top);
     }

     public T pop(){
         T result = top.item;
         if(!top.end()){
             top = top.next;
         }
         return result;
     }

     public static void main(String[] args){
         LinkedStack<String> lss = new LinkedStack<String>();
         for(String s : "ciao sono piccolo".split(" ")){
             lss.push(s);
         }
         String s;
         while((s = lss.pop()) != null){
             System.out.println(s);
         }

     }
 }