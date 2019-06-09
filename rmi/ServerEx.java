
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.*; 



public class ServerEx extends UnicastRemoteObject implements StringInterface {
    public ServerEx() throws RemoteException{
        super(0);
    }
    public int ContaCaratteri(String str){
        return str.length();
    }

    public String Maiuscolo(String str){
        return str.toUpperCase();
    }

    public static void main(String[] args) throws Exception{
        try {
            LocateRegistry.createRegistry(8080);
        } catch (Exception e) {
            //TODO: handle exception
        }

        ServerEx sx = new ServerEx();
        Naming.rebind("//localhost:8080/RmiServer", sx);
    }
}