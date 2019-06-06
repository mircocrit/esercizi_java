/**
 * Esempio di uso di set
 */

 /** classe Utility */
 // Java program generate a random AlphaNumeric String 
// using Math.random() method 

import java.util.*;
  
class RandomString { 
  
    // function to generate a random string of length n 
    private static String getAlphaNumericString(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 

    public static String[] getRandomStrings(int n){
        String[] s = new String[n];
        for(int i= 0; i < n; i++){
            s[i] = getAlphaNumericString(5);
        }
        return s;
    }
} 
/** fine classe Utility */
 public class Set1 {
     static String[] strings = RandomString.getRandomStrings(10);
     public static void testVisual(Set a){
        List<String> list = Arrays.asList(strings);
        a.addAll((Collection)list);
        a.add("one");
        a.add("one");
        a.add("one");
        a.add("one");
        System.out.println("a doesn't contain duplicates "+ a);
        System.out.println("a.contains('one') = "+a.contains("one"));
     }
     public static void main(String[] args){
         System.out.println("HashSet");
         testVisual(new HashSet());
         System.out.println("TreeSet");
         testVisual(new TreeSet());
     }
 }