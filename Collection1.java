/**
 * uso di Collection e Collections
 */

 import java.util.*;

 public class Collection1 {
     public static void main(String[] args){
         Collection c = new ArrayList();
         c.add("USA");
         c.add("Canada");
         c.add("Germany");

         List<String> countries = new ArrayList<String>();
         countries.add("Italy");
         countries.add("Slovenia");
         countries.add("Spain");
         
         System.out.println("countries before fill "+ countries);
         Collections.fill(countries,"Usa");
         System.out.println("countries before fill "+ countries);

         Object[] array = c.toArray();
//         String[] str = (String[]) c.toArray();
         System.out.println("Collections.max(c) = "+Collections.max(c));
         System.out.println("Collections.min(c) = "+Collections.min(c));

         c.addAll((Collection) countries);
         System.out.println("c after addAll"+c);

         c.remove("USA");
         System.out.println("c after remove('USA')"+c);

         c.removeAll((Collection) countries);
         System.out.println("c after removeAll(countries)"+c);





         

     }
 }