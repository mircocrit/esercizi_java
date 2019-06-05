/**
 * Implementazione interfaccia Comparator
 */

 import java.util.*;

 class CompTypeComparator implements Comparator {
    public int compare(Object o1, Object o2){
        int j1 = ((CompType)o1).j;
        int j2 = ((CompType)o2).j;
        return (j1 < j2 ? -1 : (j2 == j1) ? 0 : 1);
    }
 }

 public class ComparatorTest {
     public static void main(String[] args){
        CompType[] a = new CompType[10];
        a =CompType.generator(a.length);
        System.out.println("before sorting, a = "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sorting, a = "+Arrays.toString(a));
     }
 }