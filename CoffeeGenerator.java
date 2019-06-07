import java.util.Iterator;
import java.util.Random;



/**
 * Classe cher rappresenta interfacce, ed iterator
 */

 class Coffee {
    private static long counter = 0;
    private final long id = counter ++;
    public String toString(){
        return getClass().getSimpleName()+ " "+id;
    } 
 }

 interface Generator<T> {
    T next();
}

 class Mocha extends Coffee {}
 class Americano extends Coffee {}
 class Breve extends Coffee {}
 class Capuccino extends Coffee {}

 public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee>{
    private static Random rand = new Random(47);
    //for iteration
    private int size = 0;
    public CoffeeGenerator(){}
    public CoffeeGenerator(int sz){ size = sz;}
    public Coffee next(){
        Coffee a = new Coffee();
        int i = rand.nextInt(4);
        switch(i){
            case 0:
                a = new Mocha();
                break;
            case 1:
                a = new Capuccino();
                break;
            case 2:
                a = new Americano();
                break;
            case 3:
                a = new Breve();
                break;
        }

        return (Coffee)a;
    }
    //inner public class
    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        public boolean hasNext(){ return count > 0;}
        public Coffee next(){
            count --;
            return CoffeeGenerator.this.next();
        }
        public void remove() { //not implemented
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Coffee> iterator(){
        return new CoffeeIterator();
    }

    public static void main(String[] args){
        CoffeeGenerator gen = new CoffeeGenerator();
        for(int i = 0 ; i < 5; i++){
            System.out.println(gen.next());
        }
        /*Crea un oggetto di classe generator invocando il costruttore opportuno.
         Crea un iteratore su questo oggetto. Itera sull’iteratore */
         for(Coffee c : new CoffeeGenerator(5))
            System.out.println(c);
        CoffeeGenerator c1 = new CoffeeGenerator(5); 
        Iterator<Coffee> i1 = c1.iterator();
        while(i1.hasNext()){
                Coffee c= i1.next();
                System.out.println(c);
            }

    }


 }