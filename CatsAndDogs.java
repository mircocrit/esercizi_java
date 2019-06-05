import java.util.ArrayList;

/**
 * Esempio di perdita d'informazione. Dei contenitori
 */
class Cat {
    private int catNumber;
    Cat (int i) { catNumber = i;}
    void print(){
        System.out.println("Cat #"+catNumber);
    }
}

class Dog{
    private int dogNumber;
    Dog(int i){
        dogNumber = i;
    }
    void print(){
        System.out.println("Dog #"+dogNumber);
    }
}

public class CatsAndDogs {
    public static void main(String[] args){
        ArrayList cats = new ArrayList();
        for(int i = 0; i < 7; i++){
            cats.add(new Cat(i));
        }
        //non ci sono problemi ad aggiunger un tipo differente, ad esempio un cane
        cats.add(new Dog(7)); 
        for(int i = 0; i < cats.size(); i++){
            //genera eccezione al run time  solo ((Cat)cats.get(i)).print(); al posto dell'if 
            // possibile soluzione 
            if(cats.get(i) instanceof Cat){
                ((Cat)cats.get(i)).print();
            }else{
                ((Dog)cats.get(i)).print();
            }
        }
    }
}



