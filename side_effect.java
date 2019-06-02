public class side_effect{
    int i;
    side_effect(int ii){ i = ii;}
    static void f(side_effect ref){
        ref.i++;
    }
    public static void main(String args[]){
        side_effect x = new side_effect(7);
        System.out.println("x: " + x.i);
        System.out.println("Calling f(x)");
        f(x);
        System.out.println("x: " + x.i);
    }
}