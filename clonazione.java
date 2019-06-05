/**
 * Esempio di shallow copy
 */
import java.util.*;

class Int{
    private int i;
    public Int(int ii){ i = ii;}
    public void increment(){ i++;}
    public String toString(){
        return Integer.toString(i);
    }
}

public class clonazione{

    public static void main(String[] args){
        ArrayList<Int> v = new ArrayList<Int>();

        for(int i = 0; i < 10; i++){
            v.add(new Int(i));
        }

        System.out.println("v: " + v);

        ArrayList<Int> v2 = (ArrayList)v.clone();
        for(int i=0;i < v.size();i++){
            ((Int)v2.get(i)).increment();
        }

        System.out.println("v: " + v);


    }
}