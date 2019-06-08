import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Cliente  implements Comparable<Cliente>{
    private String cf;
    private String nome;
    private String cognome;
    private Float reddito;
    public Cliente(String cf, String nome,String cognome, Float reddito) {
        //if(cf.length() != 16) throw new Exception("Cf not valid");
        this.cf = cf;
        this.nome = nome;
        this.cognome = cognome;
        
        if(reddito != null && reddito > 0){
            this.reddito = reddito;
        }else{
           // throw new Exception("Reddito not valid");

        }
    }

    public String getCf(){
        return this.cf;
    }

    public Float getReddito(){
        return this.reddito;
    }



    public int compareTo(Cliente c1){
        if(this.cf.equals(c1.getCf())){
            return 0;
        }else {
            return (int)(this.reddito -c1.getReddito());
        }
    }





    public String toString() {
        return "Cliente{" + '\'' +
                "cf='" + cf +
                ", name='" + nome + '\'' +
                ", surname='" + cognome + '\'' +
                ", reddito=" + reddito + 
                '}';
    }
}

class ClientComparator implements Comparator<Cliente>{
       
     public int compare(Cliente c1, Cliente c2){
        if(c2.getCf().equals(c1.getCf())){
            return 0;
        }else {
            return (int)(c2.getReddito() -c1.getReddito());
        }
    }



}


public class TreeClienti {

    public static void main(String[] args){
        TreeSet<Cliente> treeCl = new TreeSet<Cliente>();

        treeCl.add(new Cliente("VDKGMV51H17G289T","aa","bb",10.20F));
        treeCl.add(new Cliente("VTDPPV95T14L522A","aa","bb",11.20F));
        treeCl.add(new Cliente("XDXTKM27D45I878T","aa","bb",9.20F));
        //stesso codice fiscale uguale al primo
        treeCl.add(new Cliente("VDKGMV51H17G289T","aa","bb",15.20F));

        for (Cliente e : treeCl) {
            System.out.println(e);
        }

        System.out.println(treeCl);
    }
}