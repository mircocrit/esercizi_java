/**
 * Utilizzo dell'interfaccia comparable
 */
import java.util.*;

public class CompType implements Comparable{
    int i,j;
    public CompType(int n1,int n2){
        i = n1;
        j = n2;
    }
    public String toString() {
        return "[i = "+i+" , j = "+j+"]";
    }
    public int compareTo(Object rv){
        int rvi = ((CompType)rv).i;
        return (i < rvi ? -1 : (i == rvi ? 0 : 1 ));
    }

    private static Random r = new Random();
    private static int randInt(){
        return Math.abs(r.nextInt()) % 100;
    }
    public static CompType[] generator(int len){
        CompType[] a = new CompType[len];
        for(int i=0; i< len; i++){
            a[i] = new CompType(randInt(), randInt());
        }
        return a; 
    }
    public static void main(String[] args){
        CompType[] a = new CompType[10];
        a = generator(a.length);
        System.out.println("before sorting, a = "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sorting, a = "+Arrays.toString(a));
    }


}