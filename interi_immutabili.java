/**
 * Esempio di classe read-only
 */
import java.util.*;
import java.lang.reflect.Method;

public class interi_immutabili{
    public static void main(String[] args){
        ArrayList v = new ArrayList();
        for(int i = 0; i < 10; i++){
            v.add(new Integer(i));
        }
        System.out.println("La classe Integer non include metodi per modificare lo stato");
        Method methods[] = Integer.class.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method);
        }
    }
}