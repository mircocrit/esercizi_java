public class aliasing{
    int i;
    aliasing(int ii){ i = ii;}
    public static void main(String args[]){
        aliasing x = new aliasing(7);
        aliasing y = x; //Assign the refernce
        System.out.println("x: "+x.i);
        System.out.println("y: "+y.i);
        System.out.println("Incrementing x");
        x.i ++;
        System.out.println("x: "+x.i);
        System.out.println("y: "+y.i);
    }
}