/**
 * Esempio di java generics fatto senza il supporto di java
 */

 public class Holder2{
     private Object a;
     public Holder2(Object a){
         this.a = a;
     }
 
     public void set(Object a){
         this.a = a;
     }

     public Object get(){ return a;}
 
     public static void main(String[] args){
         Holder2 h2 = new Holder2(new Integer(1));
         Integer i = (Integer)h2.get();
         h2.set("string obj");
         String s = (String)h2.get();
         h2.set(1);
         //Autoboxes to Integer
         Integer k = (Integer)h2.get();
     }
 
 
 
 }