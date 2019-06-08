// The implementation of
// the PerfectTime remote object.
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.*;

public class PerfectTime
extends UnicastRemoteObject
implements PerfectTimeI {
    // Implementation of the interface:
    public long getPerfectTime() throws     RemoteException {
        return System.currentTimeMillis();
    }
    // Must implement constructor
    // to throw RemoteException:
    public PerfectTime() throws RemoteException {
        // super(); // Called automatically
    }
    
    // Registration for RMI serving. Throw
    // exceptions out to the console.
    public static void main(String[] args)
    throws Exception {
        System.setSecurityManager(
        new RMISecurityManager());
        PerfectTime pt = new PerfectTime();
        Naming.bind(
        "//localhost:80/PerfectTime", pt); 
        System.out.println("Ready to do time");
    }
} 