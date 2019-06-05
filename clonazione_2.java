/**
* 
* Esempio di lista di oggeti clonati e modifica sulla seconda lista.
*/

import java.util.*;

class Int2 implements Cloneable{
    private int i;
    public Int2(int ii){ i = ii;}
    public void increment() { i++;}
    public String toString() {
        return Integer.toString(i);
    }
    public Object clone() {
        Object o = null;
        try{
            o = super.clone();
        }catch(CloneNotSupportedException e){
            System.out.println("Int2 doesn't implement Cloneable interface");
        }
        return o;
    }
}

public class clonazione_2 {
    public static void main(String[] args) {
        ArrayList<Int2> v = new ArrayList<Int2>();
        for(int i = 0; i < 10; i++){
            v.add(new Int2(i));
        }
        System.out.println("v: "+v);
        //l'istruzione seguente copia la struttura del dato
        ArrayList<Int2> v2 = (ArrayList)v.clone();
        
        // test sulla shallow copy 
        /** 
        ((Int2)v2.get(0)).increment();
        System.out.println("v2 shallow copy: "+v2);
        */

        //ora clona ogni elemento
        for(int i=0; i < v.size(); i++){
            v2.set(i,((Int2)v.get(i)).clone());
        }
        //increments all v2 elements
        for(int i=0; i < v2.size(); i++){
            ((Int2)v2.get(i)).increment();
        } 

        System.out.println("v: "+v);
        System.out.println("v2: "+v2);
    }
}