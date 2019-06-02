/**
 * Esempio di implementazione 
 * dell'interfaccia cloneable.
 */

import java.util.*;

class MyObject implements Cloneable {
    
    int i;
    
    MyObject(int ii){ i = ii; }

    // Verifica che la superclasse di MyObject, cioè 
    // Object, abbia un metodo clone: se si, copia l’oggetto,
    // altrimenti restituisce un riferimento nullo

    public Object clone() {
         Object o = null;
         try{
             o = super.clone();
         }catch(CloneNotSupportedException e){
             System.err.println("MyObject can't clone");
         }

         return o;
    }

    public String toString(){
        return Integer.toString(i);
    }
}

public class clonazione_1 {
    static MyObject g(MyObject v){
        //passando un riferimento modifica l'oggetto esterno
        v.i ++;
        return v;
    }

    static MyObject f(MyObject v){
        v = (MyObject) v.clone(); //copia locale
        v.i ++;
        return v;
    }

    public static void main(String[] args){
        MyObject a = new MyObject(11);
        MyObject b = g(a);

        // Effettua un controllo di equivalenza dei riferim.,
        // non un controllo di equivalenza di oggetti
        if(a == b){
            System.out.println("a == b");
        }else{
            System.out.println("a != b");
        }

        System.out.println("a = "+a);
        System.out.println("b = "+b);

        MyObject c = new MyObject(47);
        MyObject d = f(c);

        if(c == d){
            System.out.println("c == d");
        }else{
            System.out.println("c != d");
        }

        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}

