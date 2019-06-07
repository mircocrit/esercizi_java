/**
 * Esempio di java generics seguendo java
*/

public class Holder3<T> {
    private T a;
        
    public Holder3(T a) { this.a = a; }
    
    public void set(T a) { this.a = a; }
    
    public T get() { return a; }
    
    public static void main(String[] args) {
      
      Holder3<Integer> h3 =
        new Holder3<Integer>(new Integer(3));
      
        Integer a = h3.get(); // No cast needed
      
      // h3.set("Not an Automobile"); // Error
      // h3.set(1); // Error
     Holder3<String> h4 = 
          new Holder3<String>("Not an Automobile");
    }
  }