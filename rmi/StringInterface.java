import java.rmi.RemoteException;
import java.rmi.Remote;

public interface StringInterface extends Remote {
    public int ContaCaratteri(String str) throws RemoteException;

    public String Maiuscolo(String str) throws RemoteException;
}