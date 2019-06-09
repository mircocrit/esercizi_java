import java.rmi.Naming;

public class ClientEx {
    public static void main(String[] args) throws Exception{
        StringInterface obj = (StringInterface)Naming.lookup("//localhost:8080/RmiServer");
        System.out.println(obj.ContaCaratteri("parola"));
        System.out.println(obj.Maiuscolo("parola"));
    }
}