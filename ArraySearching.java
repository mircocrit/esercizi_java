/**
 * ricerca binaria nell'array
 * 
 */

 import java.util.*;

 public class ArraySearching {
     public static void main(String[] args){
         int[] a = new int[100];
         Random random = new Random();
         //ints(streamSize,firstnumber,secondnumber)
         a = random.ints(100,0,150).toArray();
         Arrays.sort(a);
         System.out.println("Array sorted, a = "+Arrays.toString(a));
         while(true)
         { 
             int r = random.nextInt();
             int location = Arrays.binarySearch(a, r);
             if(location > 0){
                 System.out.println("Location of "+r+" is "+ location+" a["+location+"] = "+r);
                 break;
             }
         }


     }
 }