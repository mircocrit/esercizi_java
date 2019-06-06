/**
 * Esempio di HashMap
 */

 // TODO:da reimplementare
import java.util.*;

class Counter {
    int i = 1;
    public String toString() {
        return Integer.toString(i);
    }
}

class Statistic {
    public static void main(String[] args){
        HashMap hm = new HashMap<>();
        for(int i=0;i<10000;i++){
            Integer r = new Integer((int)Math.random() * 20);
            if(hm.containsKey(r)){
                ((Counter)hm.get(r)).i++;
            }else{
                hm.put(r,new Counter());
            }
            System.out.println(hm);

        }
    }
}