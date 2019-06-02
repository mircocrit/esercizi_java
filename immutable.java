/**
 * Esempio di classi che passano da 
 * immutabili a mutabili e viceversa.
 */

class Mutable{
    private int data;
    public Mutable(int initVal){
        data = initVal;
    }
    public Mutable add(int x){
        data += x;
        return this;
    }
    public Mutable multiply(int x){
        data *= x;
        return this;
    }
    public immutable makeImmutable(){
        return new immutable(data);
    }
}

public class immutable{
    private int data;
    public immutable(int initVal){
        data = initVal;
    }
    public int read(){ return data;}
    public boolean nonzero(){ return data!=0;}
    public immutable add(int c){ return new immutable(data+c);}
    public immutable multiply(int c){ return new immutable(data*c);}
    public Mutable makeMutable(){ return new Mutable(data);}

    public static immutable modifyv1(immutable y){
        immutable val = y.add(12);
        val = val.multiply(3); //crea un nuovo oggetto;
        val = val.add(11); //crea un nuovo oggetto;
        val = val.multiply(2); //crea un nuovo oggetto;
        return val;
    }

    public static immutable modifyv2(immutable y){
        Mutable m = y.makeMutable();
        m.add(12).multiply(3).add(11).multiply(2);
        return m.makeImmutable();
    }

    public static void main(String[] args){
        immutable i1 = new immutable(47);
        immutable r1 = modifyv1(i1);
        immutable r2 = modifyv2(i1);
        System.out.println("i1 : "+i1.read());
        System.out.println("r1 : "+r1.read());
        System.out.println("r2 : "+r2.read());
    }




}