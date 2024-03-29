/**
 * Containers print themselves automatically
 */

/* output explained

[dog, dog, cat] Arraylist
[cat, dog]      HashSet doesn't contain duplicates
{cat=Rags, dog=Spot} HashMap doesn't contain duplicates key
*/


 import java.util.*;
 public class PrintingContainers {
     static Collection fill(Collection c){
         c.add("dog");
         c.add("dog");
         c.add("cat");
         return c;
     }
     static Map fill(Map m){
         m.put("dog","Bosco");
         m.put("dog","Spot");
         m.put("cat","Rags");
         return m;
     }
     public static void main(String[] args){
         System.out.println(fill(new ArrayList()));
         System.out.println(fill(new HashSet()));
         System.out.println(fill(new HashMap()));
     }
 }

