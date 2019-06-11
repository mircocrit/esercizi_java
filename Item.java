import java.io.Serializable;

public class Item implements Serializable {
    int id;
    String barcode;
    int amount;
    String name;
    int type;

    public Item(int id,String barcode,int amount,String name,int type){
        this.id = id;
        this.barcode = barcode;
        this.amount = amount;
        this.name = name;
        this.type = type;
    }

    public String toString(){
        String s = String.format("[id: %d, barcode: %s, amount: %d, name: %s, type: %d]",id,barcode,amount,name,type);
        return s;
    }
}
