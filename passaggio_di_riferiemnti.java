

public class passaggio_di_riferimenti {
    static void f(passaggio_di_riferimenti a){
        System.out.println("a inside f():" +a);
    }
    public static void main(String[] args) {
        passaggio_di_riferimenti p = new passaggio_di_riferimenti();
        System.out.println("p inside main():"+p);
        f(p);        
    }
}