/**
 * Esempioi di utilizzo di Arrays.equals
 *
 */

 import java.util.*;

 public class ComparingArrays {
     public static void main(String[] args){
         int[] a1 = new int[10];
         int[] a2 = new int[10];
         Arrays.fill(a1,47);
         Arrays.fill(a2,47);
         System.out.println("equals() a1 and a2 ? answer: "+Arrays.equals(a1, a2));
         a2[3] = 11;
         System.out.println("equals() a1 and a2 after change a2[3]=11 ? answer: "+Arrays.equals(a1, a2));
        String[] s1 = new String[5];
        Arrays.fill(s1,"Hi");
        String[] s2 = {"Hi","Hi","Hi","Hi","Hi"};
        System.out.println("equals() s1 and s2 ? answer: "+Arrays.equals(s1, s2));

     }
 }