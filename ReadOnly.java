/**
 * Uso dei metodi Collections.unmodifiable
 */

 import java.util.*;

 public class ReadOnly {
     public static void main(String[] args){
        Collection c = new ArrayList(Arrays.asList(RandomString.getRandomStrings(25)));
        c = Collections.unmodifiableCollection(c);
        System.out.println(c);
        //c.add("one") errore
        List a = new ArrayList<>(Arrays.asList(RandomString.getRandomStrings(25)));
        ListIterator lit = a.listIterator();
        System.out.println(lit.next());
        //lit.add("one") errore
        Set s = new HashSet<>(Arrays.asList(RandomString.getRandomStrings(25)));
        s = Collections.unmodifiableSet(s);
        System.out.println(s);
        //s.add("one")  errore
        Map m = new HashMap<String,String>();
        m.put("key","value");
        m.put("first","first");
        m = Collections.unmodifiableMap(m);
        System.out.println(m);
        m.put("second","second"); //solleva eccezione UnsupportedOperationException

     }
 }