public class classe_readonly_personalizzata{
    private int data;
    public classe_readonly_personalizzata(int initVal){ data = initVal;}
    public int read(){ return data;}
    public boolean nonzero(){ return data != 0;}
    //rendo la classe read-only ritornando una nuova istanza di questa stessa classe
    public classe_readonly_personalizzata quadruple(){ return new classe_readonly_personalizzata(data*4);}
    static void f(classe_readonly_personalizzata im){
        classe_readonly_personalizzata quad = im.quadruple();
        System.out.println("im : "+im.read());
        System.out.println("quad : "+quad.read());
    }
    public static void main(String args[]){
        classe_readonly_personalizzata x = new classe_readonly_personalizzata(47);
        System.out.println("x = "+x.read());
        f(x);
        System.out.println("x = "+x.read());        
    }

}