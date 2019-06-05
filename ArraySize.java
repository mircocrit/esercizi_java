/**
 * Inizzializzazione e assegnamento di array
 */

 class Weeble{}
 public class ArraySize {
     public static void main(String[] args){
         //Array di oggetti
         //gli array sono oggetti di prima classe
         Weeble[] a;//Null reference
         Weeble[] b = new Weeble[5];
         Weeble[] c = new Weeble[4];
         for(int i=0;i < c.length; i++){
             c[i] = new Weeble();
         }
         //inizializzazione aggregata statica:
         Weeble[] d = {new Weeble(),new Weeble(),new Weeble()};
         //inizializzazione aggregata dinamica:
         a = new Weeble[] {new Weeble(),new Weeble()};
         System.out.println("a.length="+a.length);
         System.out.println("b.length="+b.length);
         //i riferimenti nell'array sono inizializzati an null per difetto:
         for(int i=0; i < b.length; i++){
             System.out.println("b["+i+"]="+b[i]);
         }
         System.out.println("c.length = "+c.length);
         System.out.println("d.length = "+d.length);
         a = d;
         System.out.println("a.lenght = "+a.length);
         //Array di tipi primitivi:
         int[] e;//null reference
         int[] f = new int[5];
         int[] g = new int[4];
         for(int i=0;i< g.length;i++){
             g[i] = i*i;
         }
         int[] h = {11,47,93};

         //System.out.println("e.length = "+e.length);
         //Errore di compilazione: e non è inizializzata

         System.out.println("f.length  ="+f.length);

         //inizializzazione a zero per difetto
         for(int i=0; i < f.length;i++){
            System.out.println("f["+i+"]="+f[i]);
         }

         System.out.println("g.length="+g.length);
         System.out.println("h.length="+h.length);
         e = h;
         System.out.println("e.length = "+e.length);
         e = new int[] {1,2};
         System.out.println("e.length = "+e.length);
    }
 }